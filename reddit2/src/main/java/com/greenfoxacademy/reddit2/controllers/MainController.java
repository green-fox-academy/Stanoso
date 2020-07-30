package com.greenfoxacademy.reddit2.controllers;

import com.greenfoxacademy.reddit2.modells.User;
import com.greenfoxacademy.reddit2.services.PostService;
import com.greenfoxacademy.reddit2.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class MainController {

    UserService userService;
    PostService postService;

    public MainController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping(value = {"/", "/{page}"})
    public String showPosts(Model model, @PathVariable (required = false) Integer page) {
        User currentUser = this.userService.getCurrentUser();
        String log = this.userService.setLogStatus(currentUser);
        String currentUserName = this.userService.setCurrentUser(currentUser);
        model.addAttribute("log", log);
        model.addAttribute("currentUserName", currentUserName);
        List<Integer> totalPages = this.postService.getListOfPageNumbers();
        Integer currentPage = this.postService.getCurrentPage(page, totalPages.size());
        model.addAttribute("page", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("posts", this.postService.getListoOfPostsDTOForPageNumber(currentPage));
        return "index";
    }
}
