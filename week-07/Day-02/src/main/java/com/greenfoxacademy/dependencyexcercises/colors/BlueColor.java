package com.greenfoxacademy.dependencyexcercises.colors;

import org.springframework.stereotype.Component;

@Component
public class BlueColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("It is blue in color ...");
    }
}
