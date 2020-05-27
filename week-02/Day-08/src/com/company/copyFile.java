package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class copyFile {

    public static void main(String[] args) {

        copiesFile ("src/com/company/my-file.txt", "src/com/company/copyofmy-file.txt" );

    }

    public static void copiesFile (String path1, String path2) {

        try
        {
            Path pathN1 = Paths.get(path1);
            Path pathN2 = Paths.get(path2);
            List<String> contentOf1 = Files.readAllLines(pathN1);
            List<String> contentOf2 = new ArrayList<String>();
            for (int i = 0; i < contentOf1.size() ; i++) {
                contentOf2.add(contentOf1.get(i));

            }
            Files.write(pathN2, contentOf2);
            System.out.println("true");
        }
        catch (Exception e)
        {
            System.out.println("Writing unsuccesfull!");
        }
    }
}
