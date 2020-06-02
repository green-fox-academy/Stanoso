package com.company;



public class greatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(gCD(54, 216));
    }

    public static int gCD(int a, int b) {
         if (a ==0) {
             return b;
            } else {
              return gCD(b%a,a);
            }
        }

    }


