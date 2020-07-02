package com.greenfoxacademy.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private String currency;
    private boolean king;
    private boolean goodType;



    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = Math.round(balance*100) / 100.0;
        this.animalType = animalType;
        this.currency = "Worms";
        this.king = false;
        this.goodType = true;
    }

    public BankAccount(String name, double balance, String animalType, String currency) {
        this.name = name;
        this.balance = Math.round(balance*100) / 100.0;
        this.animalType = animalType;
        this.currency = currency;
        this.king = false;
        this.goodType = true;

    }

    public BankAccount(String name, double balance, String animalType, String currency, boolean king) {
        this.name = name;
        this.balance = Math.round(balance*100) / 100.0;
        this.animalType = animalType;
        this.currency = currency;
        this.king = king;
        this.goodType = true;
    }

    public BankAccount(String name, double balance, String animalType, String currency, boolean king, boolean goodType) {
        this.name = name;
        this.balance = Math.round(balance*100) / 100.0;
        this.animalType = animalType;
        this.currency = currency;
        this.king = king;
        this.goodType = goodType;
    }



    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isGoodType() {
        return goodType;
    }

    public void setGoodType(boolean goodType) {
        this.goodType = goodType;
    }
}
