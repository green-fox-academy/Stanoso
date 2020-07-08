package com.greenfoxacademy.dependencyexcercises;

import com.greenfoxacademy.dependencyexcercises.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyexcercisesApplication implements CommandLineRunner {

    private Printer print;

    @Autowired
    DependencyexcercisesApplication(Printer print) {
        this.print = print;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependencyexcercisesApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        print.log("Hello, what r ya doin?");
        print.Color();
    }
}