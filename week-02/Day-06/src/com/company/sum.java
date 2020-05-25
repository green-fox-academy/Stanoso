package com.company;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set a number: ");
        int a = scanner.nextInt();
        sum(a);


    }

    public static void  sum (int endnumber)
    {
        int suma = 0;
        for (int i = 0; i < endnumber+1 ; i++) {

            suma += i;

        }
        System.out.println("Sum of numbers from 0 to "+ endnumber + " is " +suma);
    }
}
