package com.company;

public class numberAdder {

    public static void main(String[] args) {
        System.out.println(adder(5));

    }

    public static int adder(int n) {
        if (n == 0) {
            return n;
        } else {
            n = n + adder(n - 1);
            return n;
        }
    }
}

