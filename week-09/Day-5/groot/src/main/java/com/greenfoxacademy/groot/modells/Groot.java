package com.greenfoxacademy.groot.modells;

import org.springframework.stereotype.Component;


public class Groot {

    private String recieved;
    private String translated;

    public Groot(String recieved, String translated) {
        this.recieved = recieved;
        this.translated = translated;
    }

    public String getRecieved() {
        return recieved;
    }

    public void setRecieved(String recieved) {
        this.recieved = recieved;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
