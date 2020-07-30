package com.greenfoxacademy.chatproject.controllers;

import com.greenfoxacademy.chatproject.services.MessageService;
import com.greenfoxacademy.chatproject.viewmodels.MessageDisplayDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping(value = "/")
    public String message(Model model, @RequestParam String message) {
        this.messageService.postMessage(message);
        return "redirect:/";
    }

    @GetMapping(value = "reload")
    public String reload(Model model) {
        String result = this.messageService.reloadAll();
        return "redirect:/";
    }


}
