package com.greenfoxacademy.chatproject.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    String[] registerUser(String userName, String password1, String password2);

    String[] loginUser(String userName, String password1);

    Boolean isUserLogged();

    String[] getIndexPageStatuses();

    void logoutUser();

    String updateUser(String userName, String url);

    String getApiKey();
}
