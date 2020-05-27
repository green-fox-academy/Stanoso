package com.company;

import java.util.HashMap;

public class productDatabase {

    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<String, Integer>();
        products.put("Eggs",200);
        products.put("Milk",200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("CHicken",550);

        System.out.println("The fish is: " + products.get("Fish"));




    }

}
