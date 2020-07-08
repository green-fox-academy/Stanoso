package com.greenfoxacademy.dependencyexcercises.hellobeanworld;

import com.greenfoxacademy.dependencyexcercises.colors.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    private MyColor color;

    public Printer (MyColor color) {
        this.color = color;
    }

    public void Color() {
        this.color.printColor();
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }


}
