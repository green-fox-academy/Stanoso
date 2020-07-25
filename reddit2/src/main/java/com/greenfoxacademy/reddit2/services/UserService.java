package com.greenfoxacademy.reddit2.services;

import com.greenfoxacademy.reddit2.modells.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    User getCurrentUser();

    String save(String userName, String password1, String password2);

    String setLogStatus(User currentUser);

    String setCurrentUser(User currentUser);

    void logOut();

    String[] getVerifyUser(String user, String password);
}
