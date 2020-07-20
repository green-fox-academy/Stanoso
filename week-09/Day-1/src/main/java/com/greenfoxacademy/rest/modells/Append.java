package com.greenfoxacademy.rest.modells;

public class Append {

    private String appended;

    public Append(String appended) {
        this.appended = appended+"a";
    }

    public String getAppended() {
        return appended;
    }
}

