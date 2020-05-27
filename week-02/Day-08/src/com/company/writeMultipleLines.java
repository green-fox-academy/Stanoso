package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class writeMultipleLines {

    public static void main(String[] args) {

        writings("src/com/company/morelines.txt", "computer", 2);


    }

    public static void writings(String pathF, String setWord, int numRow) {

        try {
            Path pathFile = Paths.get(pathF);
            Files.write(pathFile, Collections.singleton(setWord));
            for (int i = 0; i < numRow - 1; i++) {
                Files.write(pathFile, Collections.singleton(setWord), StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            System.out.println("Can´t write " + setWord + " into the file");
        }

    }
}
