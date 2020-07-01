package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class helloRestController {


    private AtomicLong counter = new AtomicLong(1);

    @ResponseBody
    @RequestMapping (value = "/greeting")
    public Greeting helloRest (String name) {
        Greeting hi = new Greeting(counter.longValue(), "Hello, " + name + "!");
        counter.getAndIncrement();
        return hi;
    }



}
