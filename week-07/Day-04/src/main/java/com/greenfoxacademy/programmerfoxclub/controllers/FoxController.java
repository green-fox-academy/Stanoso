package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.FoxStock;
import com.greenfoxacademy.programmerfoxclub.repositories.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

    @Autowired
    private FoxStock foxStock;

    @Autowired
    private Tricks trickList;

    @GetMapping ("/nutritionStore")
    public String changeNutrition (@RequestParam String name, Model model) {
        model.addAttribute("foxName", name);
        model.addAttribute("foodTypes", foxStock.getFoodTypes());
        model.addAttribute("drinkTypes", foxStock.getDrinkTypes());
        return "nutrition";
    }

    @PostMapping("/nutritionChanged")
    public String addNewFox (@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
        foxStock.findFox(name).setFood(food);
        foxStock.findFox(name).setDrink(drink);
        return "redirect:/?name=" + name;

    }

    @GetMapping ("/trickCenter")
    public String trickCentre (@RequestParam String name, Model model) {
        model.addAttribute("foxName", name);
        model.addAttribute("trickList", trickList.getTricks());
        return "tricks";
    }

    @PostMapping("/trickLearned")
    public String learnTrick(@RequestParam String name, @RequestParam String trick, Model model) {
        if (foxStock.findFox(name).trickAlreadyLearned(trick)) {
            model.addAttribute("leared", "Learn another trick, "+name+" knows this.")
        }
        foxStock.findFox(name).setTrick(trick);
        return "redirect:/?name=" + name;

    }
}
