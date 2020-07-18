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
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping ("/login")
    public String login () {
        return "login";
    }

    @PostMapping("/login")
    public String logOrCreateUser (@RequestParam String userName, @RequestParam String password, Model model) {
        if (this.userService.checkIfUserExists(userName)) {
            return "redirect:/1";
        }
        model.addAttribute("userName", userName);
        return "sign-in";
    }
}
