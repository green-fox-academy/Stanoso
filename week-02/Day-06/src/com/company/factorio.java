package com.company;

import java.util.Scanner;

public class factorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set a number: ");
        int a = scanner.nextInt();
        factorio(a);


    }

    public static void factorio(int endnumber) {
        double fact = 1;
        for (int i = 1; i < endnumber + 1; i++) {

            fact *= i;

        }
        System.out.println("Factorio of " + endnumber + " is " + fact);
    }

}

