package com.greenfoxacademy.chatproject.controllers;

import com.greenfoxacademy.chatproject.services.MessageService;
import com.greenfoxacademy.chatproject.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    UserService userService;
    MessageService messageService;

    public UserController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }

    @GetMapping (value = "/")
    public String mainPage (Model model) {
        String[] status = this.userService.getIndexPageStatuses();
        model.addAttribute("currentUser", status[0]);
        model.addAttribute("login", status[1]);
        model.addAttribute("update", status[2]);
        model.addAttribute("newUser",status[3]);
        if (status[4].equals("Avatar URL not set.")) {
            status[4] = "img/white.png";
        }
        model.addAttribute("avatarUrl",status[4]);
        model.addAttribute("myMessages", this.messageService.getMyMessages());
        return "index";
    }

    @GetMapping (value = "/register")
    public String registerInput () {
        return "register";
    }

    @PostMapping(value = "/register")
    public String registerNewUser(@RequestParam String userName, @RequestParam String password1, @RequestParam String password2, Model model) {
        String[] result = this.userService.registerUser(userName, password1, password2);
        if (result[0] == "passKO") {
            model.addAttribute("currentUserName", userName);
            model.addAttribute("error", result[1]);
            return "register";
        } if (result[0] == "userExists") {
            model.addAttribute("error", result[1]);
            return "register";
        }
        return "redirect:/";
    }

    @GetMapping (value = "/login")
    public String loginInput () {
        return "login";
    }

    @PostMapping (value = "/login")
    public String logUser (@RequestParam String userName, @RequestParam String password, Model model) {
        String[] loginResult = this.userService.loginUser(userName,password);
        if (loginResult[0]=="OK") {
            return "redirect:/";
        }
        model.addAttribute("error",loginResult[1]);
        return "login";
    }

    @GetMapping (value = "/logout")
    public String logout () {
        this.userService.logoutUser();
        return "redirect:/";
    }

    @GetMapping (value = "update")
    public String updateInput (Model model) {
        String[] status = this.userService.getIndexPageStatuses();
        model.addAttribute("currentUser", status[0]);
        model.addAttribute("currentUrl", status[4]);
        return "update";
    }

    @PostMapping (value = "update")
    public String updateUser (Model model, @RequestParam (required = false) String userName, @RequestParam (required = false) String url) {
        String result = this.userService.updateUser(userName,url);
        String[] status = this.userService.getIndexPageStatuses();
        model.addAttribute("currentUser", status[0]);
        model.addAttribute("currentUrl", status[4]);
        model.addAttribute("error", result);
        return "update";
    }

}
