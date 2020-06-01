package com.company;

public class strings2 {

    public static void main(String[] args) {
        System.out.println(removeX("HXxxExxLXXxxLXO"));

    }

    public static String removeX(String n) {
        if (n.length() > 0) {
            if (String.valueOf(n.charAt(n.length() - 1)).toLowerCase().equals("x")) {
                n = removeX(n.substring(0, n.length() - 1));
            } else {
                n = removeX(n.substring(0, n.length() - 1)) + String.valueOf(n.charAt(n.length() - 1));
            }
            return n;
        }
        return n;
    }

}
