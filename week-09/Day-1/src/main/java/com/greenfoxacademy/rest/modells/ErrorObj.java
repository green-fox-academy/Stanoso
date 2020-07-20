package com.greenfoxacademy.rest.modells;

public class ErrorObj {

    public String error;


    public ErrorObj(String error) {
        this.error = error;
    }

    public ErrorObj() {
        this.error="Please provide a name and a title!";
    }

    public String getError() {
        return error;
    }
}
