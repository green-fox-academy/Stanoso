package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import com.greenfoxacademy.basicwebshop.models.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebShopControllers {

    private ShopItem item = new ShopItem("T-shirt green", "Green Nike T-shirt", 460, 50);
    private Stock myStock = new Stock();

    @GetMapping("index")
    public String listAllStock(Model model) {
        model.addAttribute("stockItem", myStock.getStockItems());
        return "index";
    }

    @GetMapping("available")
    public String listAvailable(Model model) {
        model.addAttribute("stockItem", myStock.getAvailable());
        return "available";
    }

    @GetMapping("cheapest")
    public String listCheapestFirst(Model model) {
        model.addAttribute("stockItem", myStock.sortFromCheapest());
        return "cheapest";
    }

    @GetMapping("contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("stockItem", myStock.containsNike());
        return "contains-nike";
    }

    @GetMapping("most-expensive")
    public String mostExpensive (Model model) {
        model.addAttribute("item", myStock.getMostExpensive());
        return "most-expensive";
    }

    @GetMapping("average")
    public String average (Model model) {
        model.addAttribute("averageResult", myStock.getAverage());
        return "average";
    }

    @GetMapping ("search")
    public String findText (Model model, @RequestParam String text) {
        model.addAttribute("stockItem",myStock.containsText(text));
        return "search";
    }
}
