package com.company;

import java.util.ArrayList;

public class listIntroduction1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String l : names)
        {
            System.out.println(l);
        }
        for (int i = 0; i < names.size() ; i++)

            {
            System.out.println(i+1 + ". " + names.get(i));
        }

        names.remove(1);

        for (int j = names.size() - 1; j > -1 ; j--) {
            System.out.println(names.get(j));

        }
        names.clear();
        System.out.println(names.size());
    }
}
