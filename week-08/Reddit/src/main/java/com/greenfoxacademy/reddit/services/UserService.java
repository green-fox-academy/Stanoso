package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    boolean checkIfUserExists(String userName);


    boolean passwordsMatch(String password1, String password2);

    void saveNewUser(String newUser, String password1);

    boolean checkLoginOK(String userName, String password);

    User getByUserName(String currentUser);
}
