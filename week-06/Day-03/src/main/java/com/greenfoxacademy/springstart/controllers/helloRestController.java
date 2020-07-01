package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.AtomicLong;
import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloRestController {

    private long counter=0;

    @ResponseBody
    @RequestMapping (value = "/greeting")
    public AtomicLong helloRest (String name) {
        counter++;
        AtomicLong hi = new AtomicLong(counter, "Hello, " + name + "!");
        return hi;
    }



}
