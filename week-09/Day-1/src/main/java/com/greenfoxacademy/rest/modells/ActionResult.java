package com.greenfoxacademy.rest.modells;

import org.apache.catalina.filters.RemoteIpFilter;

public class ActionResult {

    private Integer until;
    private Integer result;

    public ActionResult() {

    }

    public int getUntil() {
        return until;
    }

    public int getResult() {
        return result;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
