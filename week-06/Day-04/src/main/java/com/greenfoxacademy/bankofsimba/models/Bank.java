package com.greenfoxacademy.bankofsimba.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> bankAccounts;

    public Bank() {
        bankAccounts = new ArrayList<>();
        this.bankAccounts.add(new BankAccount("Pumba", 300, "hogwart pig"));
        this.bankAccounts.add(new BankAccount("Timon", 5000, "meerkat"));
        this.bankAccounts.add(new BankAccount("Scar", 10, "lion", "Zebras", false, false));
        this.bankAccounts.add(new BankAccount("Nala", 3005, "lion","Zebras"));
        this.bankAccounts.add(new BankAccount("Simba", 2000, "lion","Zebras", true, true));
        this.bankAccounts.add(new BankAccount("Rafili", 50, "baboon","Peaches"));
        this.bankAccounts.add(new BankAccount("Shenzi", 3, "hyena","Carrions", false,false));

    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
