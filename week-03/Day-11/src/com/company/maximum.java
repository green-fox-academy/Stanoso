package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class maximum {

    public static void main(String[] args) {
        int[] field = {1, 5, 3, 34, 8, 11};
        int delka = field.length;
        System.out.println(findMax(field, delka));
    }

    public static int findMax(int[] n, int leng) {
        if (leng == 0) {
            return n[0];
        } else {
            return Math.max(n[leng - 1], findMax(n, leng - 1));
        }
    }
}
