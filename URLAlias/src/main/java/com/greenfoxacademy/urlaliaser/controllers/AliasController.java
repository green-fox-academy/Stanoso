package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.models.Alias;
import com.greenfoxacademy.urlaliaser.models.ErrorCustom;
import com.greenfoxacademy.urlaliaser.models.MessageCustom;
import com.greenfoxacademy.urlaliaser.services.AliasService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AliasController {

    AliasService aliasService;

    public AliasController(AliasService aliasService) {
        this.aliasService = aliasService;
    }

    @GetMapping(value = "/")
    public String aliasForm() {
        return "index";
    }

    @PostMapping(value = "/")
    public String addAlias(Model model, @RequestParam String url, @RequestParam String alias) {
        ResponseEntity<?> response = this.aliasService.addNewAlias(alias, url);
        if (response.getStatusCode().is2xxSuccessful()) {
            MessageCustom message = (MessageCustom) response.getBody();
            model.addAttribute("message", message.getMessage());
            return "index";
        }

        ErrorCustom error = (ErrorCustom) response.getBody();
        model.addAttribute("error", error.getError());
        model.addAttribute("url", url);
        model.addAttribute("alias", alias);
        return "index";
    }

    @GetMapping (value = "/a/{alias}")
    public String openAlias (Model model, @PathVariable String alias) {
        ResponseEntity<?> response = this.aliasService.openAlias(alias);
        if (response.getStatusCode().is2xxSuccessful()) {
            Alias open = (Alias) response.getBody();
            return "redirect:"+open.getUrl();
        }
        model.addAttribute("error", response.getStatusCode());
        return "errorpage";
    }

}
