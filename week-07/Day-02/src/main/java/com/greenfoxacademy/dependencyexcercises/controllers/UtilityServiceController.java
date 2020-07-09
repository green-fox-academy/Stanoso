package com.greenfoxacademy.dependencyexcercises.controllers;

import com.greenfoxacademy.dependencyexcercises.usefulutilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UtilityServiceController {

    @Autowired
    private UtilityService uService;

//    private UtilityService uService;
//
//    @Autowired
//    public  UtilityServiceController (UtilityService uService) {
//            this.uService = uService;
//    }


    @GetMapping ("/useful")
    public String showIndex () {
        return "index";
    }

    @GetMapping ("/useful/colored")
    public String randomBackgroundColor (Model model) {
        model.addAttribute("colored", uService.randomColor());
        return "colored";
    }

    @GetMapping ("/useful/email")
    public String validEmail (Model model, @RequestParam (required = false) String email) {
        model.addAttribute("text", uService.validateEmail(email)[0]);
        model.addAttribute("usecolor", uService.validateEmail(email)[1]);
        return "email";
    }

    @GetMapping ("/useful/decode")
    public String decode () {
        return "decoding";
    }

    @GetMapping ("/useful/encode")
    public String code () {
        return "encoding";
    }
    @PostMapping("/useful/coded")
    public String code (Model model,@RequestParam String decode,@RequestParam int decodeNumber) {
         model.addAttribute("coded", uService.caesar(decode, decodeNumber));
        return "coded";
    }
    @PostMapping("/useful/decoded")
    public String decode (Model model,@RequestParam String decode,@RequestParam int decodeNumber) {
        model.addAttribute("coded", uService.caesar(decode, -1*decodeNumber));
        return "coded";
    }

}
