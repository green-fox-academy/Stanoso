package com.greenfoxacademy.chatproject.services;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
public class DateTimeFormatter {
    public String getDate(String created) {
        return created.substring(0,10);

    }
    public String getTime(String created) {
        return created.substring(11,19);
    }

}