package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloRestController {

    @ResponseBody
    @RequestMapping (value = "/greeting")
    public Greeting helloRest () {
        Greeting hi = new Greeting(1, "Hello, World!");
        return hi;
    }

}
