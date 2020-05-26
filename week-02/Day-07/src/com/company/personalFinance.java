package com.company;

import java.util.ArrayList;

public class personalFinance {

    public static void main(String[] args) {

        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);
        Integer spend = 0;
        int highest = 0;
        int cheapest = 0;

        for (int a = 0; a < expenses.size(); a++) {
            spend += expenses.get(a);
        }
        System.out.println("We spent: " + spend);

        highest = expenses.get(0);
        for (int a = 0; a < expenses.size(); a++) {

            if (expenses.get(a) > highest) {
                highest = expenses.get(a);
            }

        }
        System.out.println(highest);

        cheapest = expenses.get(0);
        for (int a = 0; a < expenses.size(); a++) {

            if (expenses.get(a) < cheapest) {
                cheapest = expenses.get(a);
            }

        }
        System.out.println(cheapest);
        System.out.println((double) spend / expenses.size());
    }
}
