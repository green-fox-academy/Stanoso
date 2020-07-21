package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.util.Password;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Login")
    public String login() {
        return "login";
    }

    @PostMapping("/Login")
    public String logOrCreateUser(@RequestParam String userName, @RequestParam String password, Model model) {
        if (this.userService.checkIfUserExists(userName)) {
            if (this.userService.checkLoginOK(userName, password)) {
                return "redirect:/1/" + userName;
            }
            model.addAttribute("error", "This User name and Password don´t match, try it again.");
            return "login";
        }
        model.addAttribute("userName", userName);
        return "sign-in";
    }

    @GetMapping("/sign-in")
    public String signIn() {
        return "sign-in";
    }

    @PostMapping("/sign-in")
    public String saveNewUser(@RequestParam String newUser, @RequestParam String password1, @RequestParam String password2, Model model) {
        if (this.userService.checkIfUserExists(newUser)) {
            model.addAttribute("userExists", "Please use different Username, user name "+newUser+" already exists.");
            return "sign-in";
        }
        if (this.userService.passwordsMatch(password1,password2)) {
            this.userService.saveNewUser(newUser,password1);
            model.addAttribute("currentUser", newUser);
            return "redirect:/1/"+newUser;
        }
        model.addAttribute("passwordMatch", "Passwords don´t match, please set it again");
        model.addAttribute("currentUser", newUser);
        return "sign-in";
    }
}
