package com.greenfoxacademy.reddit2.controllers;

import com.greenfoxacademy.reddit2.modells.User;
import com.greenfoxacademy.reddit2.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = ("/"))
    public String showPosts(Model model) {
        User currentUser = this.userService.getCurrentUser();
        String log = this.userService.setLogStatus(currentUser);
        String currentUserName = this.userService.setCurrentUser(currentUser);
            model.addAttribute("log", log);
            model.addAttribute("currentUserName", currentUserName);
        return "index";
    }
}
