package com.company;

public class power {

    public static void main(String[] args) {
        System.out.println(powerN(3,3));

    }

    public static int powerN (int b, int n)
    {
        if (n>1)
        {
            b = b * powerN(b,n-1);
            return b;
        }
        else
        {
            return b;
        }

    }
}
