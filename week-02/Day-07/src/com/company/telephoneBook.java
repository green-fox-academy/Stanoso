package com.company;

import java.util.HashMap;

public class telephoneBook {

    public static void main(String[] args) {

        HashMap<String, String> book = new HashMap<String, String>();
        book.put("William A. Lathan", "405-709-1865");
        book.put("John K. Miller", "402-247-8568");
        book.put("Hortensia E. Foster", "606-481-6467");
        book.put("Amanda D. Newland", "319-243-5613");
        book.put("Brooke P. Askew", "307-687-2982");

        System.out.println(book.get("John K. Miller"));
        book.forEach((k, v) -> {
            if (v == "307-687-2982") {
                System.out.println(k);
            }
        });
        if (book.get("Chris E.Myers") == null)
        {
            System.out.println("We don´t know Chris E.Myers´s number.");
        }
        else {
            System.out.println("Chris E.Myers´s number is: " + book.get("Chris E.Myers"));
        }


    }
}
