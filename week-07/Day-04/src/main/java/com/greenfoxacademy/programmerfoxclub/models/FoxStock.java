package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxStock {

    List<Fox> foxStock;

    public FoxStock() {
        foxStock = new ArrayList<>();
        this.foxStock = foxStock;
        this.foxStock.add(new Fox("Joseph"));
        this.foxStock.add(new Fox("Jane"));
        this.foxStock.add(new Fox("Joey"));
        this.foxStock.add(new Fox("Jonathan"));
    }

    public Fox findFox(String petname) {
        return foxStock.stream().filter(f -> f.getName().toUpperCase().equals(petname.toUpperCase()))
                .findFirst().orElse(null);
    }

    public boolean isFoxInStock (String petname) {
        return foxStock.stream().anyMatch(f -> f.getName().toUpperCase().equals(petname.toUpperCase()));
    }
}
