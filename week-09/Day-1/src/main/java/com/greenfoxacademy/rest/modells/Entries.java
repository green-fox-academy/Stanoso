package com.greenfoxacademy.rest.modells;

public class Entries {

    private LogAll[] entries;
    private int entry_count;

    public Entries(LogAll[] entries, int entry_count) {
        this.entries = entries;
        this.entry_count = entry_count;
    }

    public LogAll[] getEntries() {
        return entries;
    }

    public void setEntries(LogAll[] entries) {
        this.entries = entries;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }
}
