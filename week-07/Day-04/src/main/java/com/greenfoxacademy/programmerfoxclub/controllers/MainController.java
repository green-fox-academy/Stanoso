package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.FoxStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private FoxStock foxStock;

    @GetMapping ("/")
    public String mainPage () {
        return "index";
    }

    @GetMapping ("/login")
    public String login () {
        return "login";
    }

    @PostMapping("/")
    public String login (Model model, @RequestParam String petname) {
        model.addAttribute("foxName", foxStock.findFox(petname).getName());
        model.addAttribute("foxTricks", foxStock.findFox(petname).getTricks());
        model.addAttribute("foxTricksNumber", foxStock.findFox(petname).getTricks().size());
        model.addAttribute("foxFood", foxStock.findFox(petname).getFood());
        model.addAttribute("foxDrink", foxStock.findFox(petname).getDrink());
        return "index";
    }
}
