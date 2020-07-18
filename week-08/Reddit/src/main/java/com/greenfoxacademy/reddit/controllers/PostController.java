package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;

@Controller
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", this.postService.findAllPosts());
        return "home";
    }

    @GetMapping("/submit")
    public String submit() {
        return "submit";
    }

    @PostMapping ("/submit")
    public String addNewPost (@RequestParam String title, @RequestParam URL url) {
        this.postService.savePost(title, url);
    return "redirect:/";
    }

    @PostMapping ("/vote")
    public String addVote (@RequestParam char plus, @RequestParam Long id) {
        this.postService.addVote(id, plus);
        return "redirect:/";
    }
}
