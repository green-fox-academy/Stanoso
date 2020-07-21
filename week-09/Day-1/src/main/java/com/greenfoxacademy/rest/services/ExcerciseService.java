package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.Entries;
import com.greenfoxacademy.rest.modells.LogAll;
import com.greenfoxacademy.rest.modells.SithTalk;
import com.greenfoxacademy.rest.modells.Translate;
import com.greenfoxacademy.rest.repositories.LogAllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ExcerciseService {

    LogAllRepository logAllRepository;

    @Autowired
    public ExcerciseService(LogAllRepository logAllRepository) {
        this.logAllRepository = logAllRepository;
    }

    public int sum(int until) {
        int sum = 0;
        for (int i = 0; i < until + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public int factor(int until) {
        int factor = 1;
        for (int i = 1; i < until + 1; i++) {
            factor *= i;
        }
        return factor;
    }

    public int sumArray(Integer[] inputArray) {
        int sum = 0;
        for (Integer a : inputArray) {
            sum += a;
        }
        return sum;
    }

    public int multiplyArray(Integer[] inputArray) {
        int sum = 1;
        for (Integer a : inputArray) {
            sum = sum * a;
        }
        return sum;
    }

    public Integer[] doubleArray(Integer[] inputArray) {
        Integer[] result = new Integer[inputArray.length];
        int counter = 0;
        for (Integer a : inputArray) {
            result[counter] = a * 2;
            counter++;
        }
        return result;
    }

    public void save(LogAll newLog) {
        this.logAllRepository.save(newLog);
    }

    public Entries getEntries() {
        List<LogAll> listOdLogs = (List<LogAll>) this.logAllRepository.findAll();
        LogAll[] allLogs = new LogAll[listOdLogs.size()];
        listOdLogs.toArray(allLogs);
        return new Entries(allLogs, allLogs.length);
    }

    public SithTalk getTalkOfSith(SithTalk text) {
        String result = "";
        String[] randomWords = {"Mmmmm.", "Urgh.", "Errr.", "Uhm.", "Uff.", "Gasp."};
        String[] sentences = text.getText().split("[.]");

        for (String sentence : sentences) {
            if (sentence.charAt(0) == ' ') {
                sentence = sentence.substring(1, sentence.length());
            }
            String[] words = sentence.split(" ");
            if (words.length > 1) {
                words[0] = words[0].toLowerCase();
                words[1] = String.valueOf(words[1].charAt(0)).toUpperCase() + words[1].substring(1);
            }

            for (int i = 0; i < words.length; i += 2) {
                if (i + 1 != words.length) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                }
            }

            words[words.length - 1] = words[words.length - 1] + ".";

            for (String word : words) {
                result = result + word + " ";
            }
            Random random = new Random();
            int length = random.nextInt(10);
            if (length % 2 == 0) {
                length = 1;
            } else {
                length = 2;
            }
            String paste = "";
            for (int i = 0; i < length; i++) {
                paste = paste + randomWords[random.nextInt(randomWords.length)] + " ";
            }
            paste = paste.substring(0, paste.length() - 1);
            result = result + paste + " ";


        }
        if (result.charAt(result.length() - 1) == ' ') {
            result = result.substring(0, result.length() - 1);
        }
        return new SithTalk(text.getText(), result);
    }

    public Translate translateToTeve(Translate text) {
        String textToTranslate = text.getText();
        String input = "";
        String part1 = "";
        for (int i = 0; i < textToTranslate.length(); i++) {
            if (Character.toString(textToTranslate.charAt(i)).matches("[AaÁáEeÉéOoÓóUuÚúŮůIiÍí]")) {
                input = ("v" + String.valueOf(textToTranslate.charAt(i))).toLowerCase();
                part1 = textToTranslate.substring(0, i + 1);
                textToTranslate = part1 + input + textToTranslate.substring(i + 1, textToTranslate.length());
                i += 2;
            }
        }
        return new Translate(textToTranslate, "teve");
    }

    public Translate translateToGibberish(Translate text) {
        String textToTranslate = text.getText();
        String translated = "";
        Random random = new Random();
        for (int i = 0; i < textToTranslate.length(); i++) {
            if (Character.toString(textToTranslate.charAt(i)).matches("[.!?_-]") || textToTranslate.charAt(i) == ' ') {
                translated = translated + String.valueOf(textToTranslate.charAt(i));
            } else if (Character.isUpperCase(textToTranslate.charAt(i))) {
                translated = translated + String.valueOf((char) (random.nextInt(25) + 97)).toUpperCase();
            } else {
                translated = translated + String.valueOf((char) (random.nextInt(25) + 97));
            }
        }
        return new Translate(translated, "gibberish");
    }

    public Entries getCountEntries(Integer count, Integer page) {
        List<LogAll> listOfLogs = (List<LogAll>) this.logAllRepository.findAll();
        if (listOfLogs.size() <= count) {
            return getEntries();
        }
        if (count * page <= listOfLogs.size()) {
            listOfLogs = listOfLogs.subList(listOfLogs.size() - (count * page), listOfLogs.size());
            listOfLogs = listOfLogs.subList(0,count);
        } else {
            listOfLogs = listOfLogs.subList(0,count);
        }

        LogAll[] allLogs = new LogAll[listOfLogs.size()];
        listOfLogs.toArray(allLogs);
        return new Entries(allLogs, allLogs.length);
    }


}
