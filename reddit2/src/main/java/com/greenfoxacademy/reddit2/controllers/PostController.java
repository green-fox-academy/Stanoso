package com.greenfoxacademy.reddit2.controllers;

import com.greenfoxacademy.reddit2.modells.User;
import com.greenfoxacademy.reddit2.services.PostService;
import com.greenfoxacademy.reddit2.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    PostService postService;
    UserService userService;

    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping (value = "newpost")
    public String getNewPost (Model model) {
        User currentUser = this.userService.getCurrentUser();
        if (currentUser==null) {
            model.addAttribute("error","You must be logged in to submit a new post.");
            return "login";
        }
        String log = this.userService.setLogStatus(currentUser);
        String currentUserName = this.userService.setCurrentUser(currentUser);
        model.addAttribute("log", log);
        model.addAttribute("currentUserName", currentUserName);
        return "newpost";
    }

    @PostMapping (value = "newpost")
    public String saveNewPost (Model model, @RequestParam String title, @RequestParam String url) {
        this.postService.saveNewPost(title,url);
        return "redirect:/";
    }
}
