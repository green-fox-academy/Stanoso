package com.company;

public class swapElements {

    public static void main(String[] args) {

        String[] orders = {"first", "second", "third"};
        String backup = orders[0];
        orders[0] = orders[2];
        orders[2] = backup;
        System.out.println(orders[0]);
        System.out.println(orders[1]);
        System.out.println(orders[2]);

    }
}
