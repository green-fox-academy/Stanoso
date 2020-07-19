package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.net.URL;

@Controller
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = {"/", "/{page}/{user}", "/{page}", "/Logout"})
    public String index(Model model, @PathVariable(required = false) Integer page, @PathVariable(required = false) String user) {
        if (page == null) {
            page = 1;
        }
        Integer totalPages = this.postService.getTotalNumberOfPages();
        if (page > totalPages) {
            page = totalPages;
        }
        String log = "";
        if (user == null) {
            log = "Login";
            user="";
        } else {
            log = "Logout";
        }
        model.addAttribute("log", log);
        model.addAttribute("currentUser", user);
        model.addAttribute("posts", this.postService.getListOfPostsForPageNumber(page));
        model.addAttribute("totalPages", this.postService.getListOfPageNumbers(totalPages));
        model.addAttribute("page", page);
        return "home";
    }

    @GetMapping("/submit")
    public String submit() {
        return "submit";
    }

    @PostMapping("/submit")
    public String addNewPost(@RequestParam String title, @RequestParam URL url) {
        this.postService.savePost(title, url);
        return "redirect:/1";
    }

    @PostMapping("/vote")
    public String addVote(@RequestParam char plus, @RequestParam Long id, @RequestParam Integer page) {
        this.postService.addVote(plus, id);
        return "redirect:/" + page;
    }
}
