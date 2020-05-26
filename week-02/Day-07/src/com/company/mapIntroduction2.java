package com.company;

import java.util.HashMap;

public class mapIntroduction2 {

    public static void main(String[] args) {

        HashMap<String, String> mapa = new HashMap<String, String>();

        mapa.put("978-1-60309-452-8", "A Letter to Jo");
        mapa.put("978-1-60309-459-7", "Lupus");
        mapa.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        mapa.put("978-1-60309-461-0", "The Lab");

        mapa.forEach((key, value) ->
        {
            System.out.println(value + " (ISBN: " + key + ")");
        });

        mapa.remove("978-1-60309-444-3");
        mapa.values().remove("The Lab");

        mapa.put("978-1-60309-450-4", "They Called Us Enemy");
        mapa.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(mapa.get("478-0-61159-424-8"));
        System.out.println(mapa.get("978-1-60309-453-5"));

        
    }
}
