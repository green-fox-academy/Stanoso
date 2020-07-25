package com.greenfoxacademy.reddit2.controllers;

import com.greenfoxacademy.reddit2.modells.User;
import com.greenfoxacademy.reddit2.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/login")
    public String loginOrNewUser() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginUser(@RequestParam String userName, @RequestParam String password, Model model) {
        String[] result = this.userService.getVerifyUser(userName, password);
        if (result[0].equals("OK")) {
            model.addAttribute("currentUserName", result[1]);
            return "redirect:/";
        }
        if (result[0].equals("KO")) {
            model.addAttribute("error", result[1]);
            return "login";
        }
        model.addAttribute("error", result[1]);
        model.addAttribute("currentUserName", userName);
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        this.userService.logOut();
        return "redirect:/";
    }

    @GetMapping(value = "/newuser")
    public String addNewUser() {
        return "newuser";
    }

    @PostMapping(value = "/newuser")
    public String saveNewUser(@RequestParam String userName, @RequestParam String password1, @RequestParam String password2, Model model) {
        String result = this.userService.save(userName, password1, password2);
        if (result == "ok") {
            return "redirect:/";
        }
        model.addAttribute("error", result);
        if (result.contains("password")) {
            model.addAttribute("currentUserName", userName);
        }
        return "newuser";
    }
}
