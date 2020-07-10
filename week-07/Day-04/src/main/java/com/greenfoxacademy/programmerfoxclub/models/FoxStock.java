package com.greenfoxacademy.programmerfoxclub.models;

import com.greenfoxacademy.programmerfoxclub.repositories.DrinkTypes;
import com.greenfoxacademy.programmerfoxclub.repositories.FoodTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void addFox (String name) {
        this.foxStock.add(new Fox(name));
    }

    public List<String> getFoodTypes () {
        return Stream.of(FoodTypes.values())
                .map(Enum::name)
                .map(x -> x.toLowerCase())
                .sorted()
                .collect(Collectors.toList());
          }

    public List<String> getDrinkTypes () {
        return Stream.of(DrinkTypes.values())
                .map(Enum::name)
                .map(x -> x.toLowerCase())
                .sorted()
                .collect(Collectors.toList());
    }
}
