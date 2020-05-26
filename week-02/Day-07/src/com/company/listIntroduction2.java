package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class listIntroduction2 {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<String>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<String>();
        listB.addAll(listA);
        listB.remove("Durian");
        listA.add("Kiwifruit");
        System.out.println("ListA size: "+ listA.size() + "\nListB size: " +listB.size());
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.addAll(Arrays.asList("Passion fruit", "Pomelo"));

        System.out.println(listA.get(2));




    }
}
