package com.company;

public class appendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendAFUnc(typo);
    }

    public static void appendAFUnc(String append) {
        append += "a";
        System.out.println(append);
    }

}
