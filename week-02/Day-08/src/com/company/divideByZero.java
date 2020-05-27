package com.company;

import java.util.Scanner;

public class divideByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set a number as a divisor:");

        try {
            int divider = scanner.nextInt();
            int result = 10 / divider;
            System.out.println("Result 10 : "+divider + " = " + result);


        } catch (ArithmeticException e) {
            System.out.println("fail");
        }

    }
}
