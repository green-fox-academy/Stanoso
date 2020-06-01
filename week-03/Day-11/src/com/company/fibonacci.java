package com.company;

public class fibonacci {

    public static void main(String[] args) {

        System.out.println(fibo(5));
    }

    public static int fibo(int n) {
        if (n > 0) {
            if (n == 0) {
                return n;
            } else if (n == 1) {
                return n;
            } else if (n == 2) {
                return n-1;
            } else if (n > 2) {
                n = fibo(n - 1) + fibo(n - 2);
                return n;
            }
        }
        return n;
    }

}
