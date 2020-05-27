package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        numLines("my-file.txt");


    }


    public static void numLines(String name) {
        try {
            Path filePath = Paths.get("src/com/company/" + name);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.size());
        } catch (Exception e) {
            System.out.println("0");                                         
        }

    }
}