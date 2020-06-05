package anagram;

import java.util.ArrayList;

public class Anagram {

    String text;

    public Anagram(String text) {
        this.text = text;
    }


    public boolean solveAnagram(String textToCompare) {

        if (this.text.length() != textToCompare.length()) {
            return false;
        } else {
            ArrayList<Character> thisText = new ArrayList<Character>();
            ArrayList<Character> toCompare = new ArrayList<Character>();

            for (int i = 0; i < textToCompare.length(); i++) {
                thisText.add(this.text.charAt(i));
                toCompare.add(textToCompare.charAt(i));
            }
            boolean skipOut = true;
            while (thisText.size() > 0) {

                for (int j = 0; j < toCompare.size(); j++) {
                    if (thisText.get(0) == toCompare.get(j)) {
                        thisText.remove(0);
                        toCompare.remove(j);
                        skipOut = false;
                        break;
                    }
                }
                if (skipOut == false) {
                    skipOut = true;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}


