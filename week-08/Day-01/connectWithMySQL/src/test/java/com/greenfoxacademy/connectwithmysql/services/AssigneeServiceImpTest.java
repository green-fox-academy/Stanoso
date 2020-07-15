package com.greenfoxacademy.connectwithmysql.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssigneeServiceImpTest {

    @Test
    void getIdByNameAndEmail() {
        AssigneeServiceImp test = new AssigneeServiceImp();
        Long toCompare = test.getIdByNameAndEmail("Jan Koloděj, jan@kolodej.cz");
        assertEquals(4l, toCompare );
    }
}