package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.modells.Groot;
import com.greenfoxacademy.groot.services.GrootService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GrootController {

    GrootService grootService

    public GrootController(GrootService grootService) {
        this.grootService = grootService;
    }

    @GetMapping ("groot")
    public ResponseEntity<?> iAmGroot (@RequestParam (required = false) Groot groot) {

    }
}
