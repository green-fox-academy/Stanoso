package com.company;

public class strings3 {

    public static void main(String[] args) {
        System.out.println(addSep("Hello my darling, hello my     honey.")); // In this case I don´t consider " " as a character

    }

    public static String addSep(String n) {
        if (n.length() > 1) {
            if (String.valueOf(n.charAt(n.length() - 1)).equals(" ") || String.valueOf(n.charAt(n.length() - 2)).equals(" ") ) {
                n = addSep(n.substring(0, n.length() - 1)) + String.valueOf(n.charAt(n.length() - 1));
            } else {
                n = addSep(n.substring(0, n.length() - 1)) + "*" + String.valueOf(n.charAt(n.length() - 1));
            }
            return n;
        }
        return n;
    }



}
