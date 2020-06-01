package com.company;

public class sumDigit {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(1812295));

    }

    public static int sumOfDigits (int n) {
        if (n/10 > 0)
        {
            n = n%10 + sumOfDigits(n/10);
            return n;
        }
        else
        {
            return n;
        }


    }
}
