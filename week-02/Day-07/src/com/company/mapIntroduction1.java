package com.company;

import java.util.HashMap;

public class mapIntroduction1 {

    public static void main(String[] args) {

        HashMap<Integer,Character> mapa = new HashMap<Integer, Character>();
        System.out.println(mapa.size());
        mapa.put(97,'a');
        mapa.put(98,'b');
        mapa.put(99,'c');
        mapa.put(65,'A');
        mapa.put(66,'B');
        mapa.put(67,'C');

        System.out.println(mapa.keySet());

        System.out.println(mapa.values());

        mapa.put(68,'D');

        System.out.println(mapa.size());

        System.out.println(mapa.get(99));

        mapa.remove(97);

        System.out.println(mapa.get(100));

        mapa.clear();

        System.out.println(mapa.size());
    }
}
