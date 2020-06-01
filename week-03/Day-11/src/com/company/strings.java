package com.company;

import javax.management.StringValueExp;

public class strings {

    public static void main(String[] args) {
        System.out.println(changeXY("XxXxXxXxXxXx"));

    }

    public static String changeXY(String n) {
        if (n.length() > 0) {
            if (String.valueOf(n.charAt(n.length() - 1)).equals("x")) {
                n = changeXY(n.substring(0, n.length() - 1)) + "y";
            } else {
                n = changeXY(n.substring(0, n.length() - 1)) + String.valueOf(n.charAt(n.length() - 1));
            }
            return n;
        }
        return n;
    }
}
