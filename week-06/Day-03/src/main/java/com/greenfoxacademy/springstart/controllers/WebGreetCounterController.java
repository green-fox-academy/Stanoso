package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebGreetCounterController {

    private long counter = 0;

    @RequestMapping (value = "/web/greeting")
    public String webGreetCounter (String name, Model model) {
        counter++;
        model.addAttribute("name", name);
        model.addAttribute("counter", counter);
        return "greeting";
    }


}
