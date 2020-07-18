package com.greenfoxacademy.reddit.services;

import org.springframework.stereotype.Component;

@Component
public interface UserService {

    boolean checkIfUserExists(String userName);
}
