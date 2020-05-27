package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class doubled {

    public static void main(String[] args) {
        try {
            Path pathTo = Paths.get("src/com/company/duplicated-chars.txt");
            List<String> content = Files.readAllLines(pathTo);
            List<String> cleared = new ArrayList<>();

            for (String line : content) {
                cleared.add(dedouble(line));

            }
            Path pathCleared = Paths.get("src/com/company/duplicated-chars-decrypt.txt");
            Files.write(pathCleared, cleared);
            System.out.println("Encrypted file: " +pathCleared + " created.");

        } catch (Exception e) {
            System.out.println("Can´t find the file!");
        }


    }

    public static String dedouble(String dd) {
        String result = "";

        for (int i = 0; i < dd.length(); i++) {
            if (i == 0) {
                result += Character.toString(dd.charAt(i));
            } else if (i < dd.length() - 1 && i > 1 && (Character.toString(dd.charAt(i)).equals(Character.toString(dd.charAt(i - 1)))) && (Character.toString(dd.charAt(i)).equals(Character.toString(dd.charAt(i - 2)))) && (Character.toString(dd.charAt(i)).equals(Character.toString(dd.charAt(i + 1))))) {
                result += Character.toString(dd.charAt(i));
            } else if (Character.toString(dd.charAt(i)).equals(Character.toString(dd.charAt(i - 1)))) {

            } else {
                result += Character.toString(dd.charAt(i));
            }
            ;
        }
        return result;

    }
}



