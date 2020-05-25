package com.company;

public class reverse {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};
        int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[(numbers.length - 1 - i)] = numbers[i];

        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reverse[i];
            System.out.println(numbers[i]);
        }

    }
}
