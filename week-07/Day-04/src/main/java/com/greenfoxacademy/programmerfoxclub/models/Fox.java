package com.greenfoxacademy.programmerfoxclub.models;

import com.greenfoxacademy.programmerfoxclub.repositories.DrinkTypes;
import com.greenfoxacademy.programmerfoxclub.repositories.FoodTypes;
import com.greenfoxacademy.programmerfoxclub.repositories.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;


public class Fox {

    private String name;
    private List<String> tricks;
    private FoodTypes food;
    private DrinkTypes drink;

    public Fox(String name, List<String> tricks, FoodTypes food, DrinkTypes drink) {
        this(name);
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<String>();
        this.food = FoodTypes.BREAD;
        this.drink = DrinkTypes.WATER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTrick(String trick) {
        this.tricks.add(trick);
    }

    public boolean trickAlreadyLearned(String trick) {
        return this.getTricks().stream().anyMatch(t -> t.equals(trick));
    }

    public String getFood() {
        return String.valueOf(food).toLowerCase();
    }

    public void setFood(String food) {
        this.food = FoodTypes.valueOf(food.toUpperCase());
    }

    public String getDrink() {
        return String.valueOf(drink).toLowerCase();
    }

    public void setDrink(String drink) {
        this.drink = DrinkTypes.valueOf(drink.toUpperCase());
    }


}
