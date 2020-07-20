package com.greenfoxacademy.rest.modells;

public class DoubleObj {

    private int received;
    private int result;


    public DoubleObj(int recieved) {
        this.received = recieved;
        this.result = 2*recieved;

    }

    public int getReceived() {
        return received;
    }

    public int getResult() {
        return result;
    }


}
