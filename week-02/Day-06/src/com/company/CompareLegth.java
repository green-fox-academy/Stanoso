package com.company;

public class CompareLegth {
    public static void main(String[] args) {
        
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        
        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length )
        {
            System.out.println("firstArrayOfNumbers is longer");    
        } else {
            System.out.println("secondArrayOfNumbers is longer");
        }
    }
}
