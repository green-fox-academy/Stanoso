package com.company;

import org.w3c.dom.ls.LSOutput;

public class bunnies2 {

    public static void main(String[] args) {
        System.out.println(bunniesEars2(4));
    }

    public static int bunniesEars2(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                n = 3 + bunniesEars2(n - 1);
            } else {
                n = 2 + bunniesEars2(n - 1);
            }
            return n;
        } else {
            return n;
        }
    }
}
