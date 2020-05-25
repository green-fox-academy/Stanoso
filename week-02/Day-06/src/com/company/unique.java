package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class unique {

    public static void main(String[] args) {
        unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34, 1, 79});


    }

    public static void unique(int[] a) {
        boolean shouldPrint = false;
        boolean comma = false;
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            shouldPrint = false;
            comma = false;
            if (i == 0) {
                System.out.print(a[i]);
            } else {
                for (int j = 0; j < i; j++) {
                    if (a[i] != a[j]) {
                        shouldPrint = true;
                        comma = true;
                    } else if (a[i] == a[j]) {
                        shouldPrint = false;
                        comma = false;
                        break;
                    }

                }

            }
            if (shouldPrint && comma) {
                System.out.print("," + a[i]);
            }else if (shouldPrint) {
                System.out.print(a[i]);
            }
            else if (comma)
            {
                System.out.print(",");
            }
            }

        System.out.print("]");
    }

    }



