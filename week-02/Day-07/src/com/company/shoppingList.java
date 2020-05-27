package com.company;

import java.util.ArrayList;

public class shoppingList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Eggs");
        list.add("Milk");
        list.add("fish");
        list.add("apples");
        list.add("bread");
        list.add("chicken");
        boolean have = false;

        for (String a : list) {
            a = a.toLowerCase();
            if (a.equals("milk"))
            {
                have = true;
            }

        }
        System.out.println("Milk is: " + have);

        have = false;
        for (String a : list) {
            a = a.toLowerCase();
            if (a.equals("bananas"))
            {
                have = true;
            }
        }
        System.out.println("Bananas is: " + have);
    }
}
