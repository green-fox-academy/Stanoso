package com.greenfoxacademy.programmerfoxclub.repositories;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Tricks {

    List<String> tricks;

    public Tricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public Tricks () {
        this.tricks = new ArrayList<>();
        this.tricks.add("ride a horse");
        this.tricks.add("sing opera");
        this.tricks.add("drive truck");
        this.tricks.add("change watch battery");
        this.tricks.add("sleep while running");

    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }
}
