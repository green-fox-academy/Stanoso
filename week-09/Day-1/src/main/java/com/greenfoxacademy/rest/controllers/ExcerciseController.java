package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.modells.*;
import com.greenfoxacademy.rest.services.ExcerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class ExcerciseController {

    private ExcerciseService excerciseService;

    @Autowired
    public ExcerciseController(ExcerciseService excerciseService) {
        this.excerciseService = excerciseService;
    }


    @GetMapping("/doubling")
    Object doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new ErrorObj("Please provide an input!");
        } else {
            LogAll newLog = new LogAll("/doubling", "input=" + String.valueOf(input));
            this.excerciseService.save(newLog);
            return new DoubleObj(input);
        }
    }

    @GetMapping("/greeter")
    Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title, HttpServletResponse response) {
        if (name == null || title == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

            if (name == null && title == null) {
                return (new ErrorObj("Please provide a name and a title!"));
            } else if (name == null) {
                return (new ErrorObj("Please provide a name!"));
            } else if (title == null) {
                return (new ErrorObj("Please provide a title!"));

            }
        }
        response.setStatus(HttpServletResponse.SC_OK);
        return new ResponseEntity<>(new Message("Oh, hi there " + name + ", my dear " + title + "!"), HttpStatus.OK);
    }

//        @GetMapping("/greeter")
//        ResponseEntity<?> greeting(@RequestParam String name, @RequestParam String title) {
//            if (name == null && title == null) {
//                return new ResponseEntity<>(new Error("Please provide a name and a title!"), HttpStatus.NOT_FOUND);
//            } else if (name == null) {
//                return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.NOT_FOUND);
//            } else if (title == null) {
//                return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.NOT_FOUND);
//
//            } else {
//
//                return new ResponseEntity<>(new Message("Oh, hi there " + name + ", my dear " + title + "!"), HttpStatus.OK);
//            }

    @GetMapping("/appenda/{appendable}")
    Append appendA(@PathVariable String appendable) {
        return new Append(appendable);
    }

    @PostMapping("/dountil/{action}")
    Object doAction(@RequestBody(required = false) ActionResult ar, @PathVariable(required = false) String action) {
        if (action.equals("sum")) {
            ar.setResult(this.excerciseService.sum(ar.getUntil()));
            return ar;
        } else if (action.equals("factor")) {
            ar.setResult(this.excerciseService.factor(ar.getUntil()));
            return ar;
        } else {
            return new ErrorObj("Please provide a number!");
        }
    }

    @PostMapping("/arrays")
    Object arrayHandle(@RequestBody(required = false) ArHandle ah, HttpServletResponse response) {
        if (ah == null || ah.getWhat() == null || ah.getNumbers() == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return new ErrorObj("Please provide what to do with the numbers!");
        }
        if (ah.getWhat().equals("sum")) {
            ah.setResult(this.excerciseService.sumArray(ah.getNumbers()));
        } else if (ah.getWhat().equals("multiply")) {
            ah.setResult(this.excerciseService.multiplyArray(ah.getNumbers()));
        } else if (ah.getWhat().equals("double")) {
            ah.setResult(this.excerciseService.doubleArray(ah.getNumbers()));
        }
        return ah;
    }


}
