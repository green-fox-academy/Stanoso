package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.LogAll;
import com.greenfoxacademy.rest.repositories.LogAllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class ExcerciseService {

    LogAllRepository logAllRepository;

    @Autowired
    public ExcerciseService (LogAllRepository logAllRepository) {
        this.logAllRepository = logAllRepository;
    }

    public int sum (int until) {
        int sum = 0;
        for (int i = 0; i < until+1 ; i++) {
            sum += i;
        }
        return  sum;
    }

    public int factor (int until) {
        int factor = 1;
        for (int i = 1; i < until+1 ; i++) {
            factor *= i;
        }
        return  factor;
    }

    public int sumArray ( Integer[] inputArray) {
        int sum = 0;
        for (Integer a : inputArray) {
            sum+=a;
        }
        return sum;
    }

    public int multiplyArray ( Integer[] inputArray) {
        int sum = 1;
        for (Integer a : inputArray) {
            sum=sum*a;
        }
        return sum;
    }

    public Integer[] doubleArray (Integer[] inputArray) {
        Integer[] result = new Integer[inputArray.length];
        int counter = 0;
        for (Integer a: inputArray) {
            result[counter] = a*2;
            counter++;
        }
        return result;
    }

    public void save(LogAll newLog) {
        this.logAllRepository.save(newLog);
    }
}
