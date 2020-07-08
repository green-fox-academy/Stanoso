package com.greenfoxacademy.dependencyexcercises.usefulutilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String[] validateEmail(String email) {
        String[] result = new String[2];
        int contains = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                contains++;
            } else if (email.charAt(i) == '.') {
                contains++;
            }
        }
        if (contains==2) {
            result[0] = email + " is a valid email adress";
            result[1] = "green";
        } else {
            result[0] = email + " is not a valid e-mail adress";
            result[1] = "red";
        }
        //email.chars()
        return result;
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }

}
