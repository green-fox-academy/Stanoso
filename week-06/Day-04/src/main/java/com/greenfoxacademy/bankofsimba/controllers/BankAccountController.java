package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankAccountController {

    private BankAccount lion = new BankAccount("Simba",2000,"lion");
    private Bank accountsList = new Bank();

    @RequestMapping (value = "show", method = RequestMethod.GET)
    public String showAccount (Model model) {
        model.addAttribute("account",lion);
        return "show-account";
    }

    @GetMapping ("template")
    public String showTemplate (Model model) {
        model.addAttribute("message", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "template";
    }


    @GetMapping ("accountlist")
    public String showAllAccounts (Model model) {
        model.addAttribute("allaccounts", accountsList.getBankAccounts());
        return "show-all-accounts";
    }


}
