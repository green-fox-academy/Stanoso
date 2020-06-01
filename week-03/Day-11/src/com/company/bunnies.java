package com.company;

public class bunnies {

    public static void main(String[] args) {
        System.out.println(bunnyEars(5));

    }

    public static int bunnyEars (int n)
    {
        if (n>0)
        {
            n = 2 + bunnyEars(n-1);
            return n;
        }
        else
        {
           return n;
        }

    }
}
