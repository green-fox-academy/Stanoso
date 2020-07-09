package com.greenfoxacademy.greenfoxclassapp.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public String count() {
        return String.valueOf(names.size());
    }

    public String checkStudent(String text) {
        long count = names.stream().filter(n -> n.toUpperCase().equals(text.toUpperCase())).count();
        if (count == 0) {
            return "Searched name \"" + text + "\" is not in the list.";
        } else {
            return "Searched name \"" + text + "\" is in the list. Number of occurences: " + count;
        }
    }


}
