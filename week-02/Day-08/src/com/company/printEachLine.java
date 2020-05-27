package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class printEachLine {

    public static void main(String[] args)  {

        try {
            Path filePath = Paths.get("src/com/company/my-file.txt");  // Nastaví do proměnné filePath cestu k souboru
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines)
            {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");

        }

    }
}
