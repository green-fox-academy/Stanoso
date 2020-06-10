package unfinished.older;

import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {

        String input = "race";
        String output = input;
        ArrayList<Character> inputInList = new ArrayList<Character>();
        int legthOfInput = input.length();

        for (int i = 0; i < legthOfInput; i++) {
            inputInList.add(input.charAt(i));
        }
        for (int i = legthOfInput - 2; i > -1; i--) {
            output += String.valueOf(inputInList.get(i));
        }

        System.out.printf("Output is : %s",output);

    }
}
