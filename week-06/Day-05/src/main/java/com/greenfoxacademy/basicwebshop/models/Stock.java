package com.greenfoxacademy.basicwebshop.models;

import java.util.*;
import java.util.stream.Collectors;

public class Stock {

    private List<ShopItem> stockItems;

    public Stock(List<ShopItem> stockItems) {
        this.stockItems = new ArrayList<>();
        this.stockItems = stockItems;
    }

    public Stock() {
        this.stockItems = new ArrayList<>();
        this.stockItems.add(new ShopItem("T-shirt blue", "Blue Nike T-shirt", 460, 51));
        this.stockItems.add(new ShopItem("Jacket", "Leather H&M jacket", 1000, 26));
        this.stockItems.add(new ShopItem("Trousers", "Suit trousers C&A, black", 650, 43));
        this.stockItems.add(new ShopItem("T-shirt black", "Black nike T-shirt", 460, 0));
        this.stockItems.add(new ShopItem("Nike swim-suit", "Yellow swimm-suit", 635, 11));
        this.stockItems.add(new ShopItem("Shorts", "Lesiure style C&A shorts", 390, 137));
        this.stockItems.add(new ShopItem("T-shirt green", "Green NIKE T-shirt", 460, 0));
        this.stockItems.add(new ShopItem("Cap", "Nike tennis cap", 290, 30));
        this.stockItems.add(new ShopItem("T-shirt yellow", "Yellow Nike T-shirt", 460, 64));
        this.stockItems.add(new ShopItem("T-shirt red", "Red Nike T-shirt", 460, 69));
    }

    public List<ShopItem> getStockItems() {
        return stockItems;
    }

    public void setStockItems(List<ShopItem> stockItems) {
        this.stockItems = stockItems;
    }

    public List<ShopItem> getAvailable() {
        List<ShopItem> available =
        this.stockItems.stream().filter(s-> s.getQuantityOfStock()>0).collect(Collectors.toList());
        return available;
    }

    public List<ShopItem> sortFromCheapest() {
        List<ShopItem> available =
                this.stockItems.stream().sorted((ShopItem s1, ShopItem s2) -> (int) (s1.getPrice() - s2.getPrice())).collect(Collectors.toList());
        return available;
    }

    public List<ShopItem> containsNike () {
        List<ShopItem> nike =
                this.stockItems.stream()
                .filter(s -> s.getDescription().toUpperCase().contains("NIKE") || s.getName().toUpperCase().contains("NIKE")).collect(Collectors.toList());


        return nike;
    }

    public ShopItem getMostExpensive() {
        List<ShopItem> mostExpensive =
                this.stockItems.stream().sorted((ShopItem s1, ShopItem s2) -> (int) (s2.getPrice() - s1.getPrice())).collect(Collectors.toList());
        return mostExpensive.get(0);
    }

    public double getAverage () {
        double average = this.stockItems.stream().mapToDouble(s -> s.getQuantityOfStock()).average().getAsDouble();
        return average;
    }

    public List<ShopItem> containsText (String find) {
        List<ShopItem> findText =
                this.stockItems.stream()
                        .filter(s -> s.getDescription().toUpperCase().contains(find.toUpperCase()) ||
                                s.getName().toUpperCase().contains(find.toUpperCase()) ||
                                String.valueOf(s.getQuantityOfStock()).toUpperCase().contains(find.toUpperCase()) ||
                                String.valueOf(s.getPrice()).toUpperCase().contains(find.toUpperCase()))
                        .collect(Collectors.toList());
        return findText;
    }
}
