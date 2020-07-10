package com.greenfoxacademy.programmerfoxclub.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoxStockTest {

    @Test
    void getFoodTypes() {
            FoxStock foxStock = new FoxStock();
            assertEquals("bread", foxStock.getFoodTypes().get(0));
        }

    }
