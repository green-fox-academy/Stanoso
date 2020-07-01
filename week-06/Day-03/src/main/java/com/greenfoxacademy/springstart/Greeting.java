package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private long id;
    private String content;


    public Greeting (long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting (String content) {
        this.id = 0;
        this.content = content;

    }




    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
