package unfinished.older;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
       String reversedLine = "";

       try {
           Path path = Paths.get("src/sourceFiles/reversed-lines.txt");
           List<String> lines = Files.readAllLines(path);
           for (String s : lines) {
               reversedLine="";
               for (int i = s.length()-1; i > -1 ; i--) {
                   reversedLine += String.valueOf(s.charAt(i));
               }
               System.out.println(reversedLine);
               Path pathWrite = Paths.get("src/sourceFiles/rereversed-lines.txt");
               Files.write(pathWrite, Collections.singleton(reversedLine),StandardOpenOption.APPEND);
           }


       } catch (IOException e)
       {
           System.out.println("Unable to read file: reversed-lines.txt");
       }

    }
}
