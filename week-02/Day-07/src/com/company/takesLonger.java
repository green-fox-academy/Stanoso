package com.company;

public class takesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String missed = "always takes longer than";
        String part1 = quote.substring(0,21);
        String part2 = quote.substring(20);
        missed = part1.concat(missed);
        quote = missed.concat(part2);


        System.out.println(quote);

    }


}



