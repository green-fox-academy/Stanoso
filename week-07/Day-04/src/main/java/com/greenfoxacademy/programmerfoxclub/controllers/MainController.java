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

    @GetMapping("/")
    public String mainPage(Model model, @RequestParam String name) {
        model.addAttribute("foxName", foxStock.findFox(name).getName());
        model.addAttribute("foxTricks", foxStock.findFox(name).getTricks());
        model.addAttribute("foxTricksNumber", foxStock.findFox(name).getTricks().size());
        model.addAttribute("foxFood", foxStock.findFox(name).getFood());
        model.addAttribute("foxDrink", foxStock.findFox(name).getDrink());
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/")
    public String login(Model model, @RequestParam String petname) {
        if (foxStock.isFoxInStock(petname)) {
            return "redirect:/?name=" + petname;
        } else {
            model.addAttribute("notPresent", "You have provided a name \"" + petname + "\" that has not been used before, add it as a new one!");
            return "login";
        }
    }
}
