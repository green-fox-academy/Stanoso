package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class writeSingleLine {

    public static void main(String[] args) {

        List<String> content = new ArrayList<String>();
        content.add("Stanislav Dostál");

        try
        {
           Path filePath = Paths.get("src/com/company/my-newfile.txt");
           Files.write(filePath,content);
        }
        catch (Exception e)
        {
            System.out.println("Unable to write file: my-newfile.txt");     
        }


    }
}
