package com.company;

import java.util.Scanner;

public class SubInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set a number from 0 to 9: ");
        int number = scanner.nextInt();
        subInt(number);
    }

    public static void subInt(int a) {
        int[] arrayOfNumbers = {1, 10, 11, 34, 52, 61, 72};
        int counter = 0;
        System.out.print("[");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == a || (arrayOfNumbers[i] / 10 == a && i != 0)  || (arrayOfNumbers[i] % 10 == a && i != 0)) {
                counter += 1;
            }
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == a || (arrayOfNumbers[i] / 10 == a && i != 0)  || (arrayOfNumbers[i] % 10 == a && i != 0)) {
                System.out.print(i);
                if (counter > 1) {
                    System.out.print(", ");
                    counter -= 1;
                }

            }
        }
        System.out.println("]");
    }
}
