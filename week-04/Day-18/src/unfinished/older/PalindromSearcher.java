package unfinished.older;

import java.util.ArrayList;

public class PalindromSearcher {

    public static void main(String[] args) {

        String input = "racecar";
        String output = "";
        ArrayList<Character> inputList = new ArrayList<Character>();
        ArrayList<Character> compareList = new ArrayList<Character>();

        for (int i = input.length(); i > 2; i--) {

            for (int j = 0; j < input.length() - i + 1; j++) {

                for (int k = 0; k < i; k++) {
                    inputList.add(input.charAt(k + j));
                    output += String.valueOf(input.charAt(k + j));
                    compareList.add(input.charAt(i - k - 1 + j));
                }

                int inputListSize = inputList.size();

                for (int h = 0; h < inputListSize; h++) {
                    if (inputList.get(0) == compareList.get(0)) {
                        inputList.remove(0);
                        compareList.remove(0);
                    } else {
                        break;
                    }
                }

                if (inputList.isEmpty()) {
                    System.out.print(output + " ");
                }
                inputList.clear();
                compareList.clear();
                output = "";

            }

        }


    }
}
