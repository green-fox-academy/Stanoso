package com.greenfoxacademy.rest.modells;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Translate {

    //@JsonInclude (JsonInclude.Include.NON_NULL)
    private String text;
    private String lang;

    public Translate(String text, String lang) {
        this.text = text;
        this.lang = lang;
    }

    public Translate () {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
