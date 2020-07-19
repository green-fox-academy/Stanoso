package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean checkIfUserExists(String userName) {
        List<User> user = (List<User>) this.userRepository.findAll();
        return user.stream().anyMatch(u -> u.getUserName().toUpperCase().equals(userName.toUpperCase()));
    }

    @Override
    public boolean passwordsMatch(String password1, String password2) {
        return password1.equals(password2);
    }

    @Override
    public void saveNewUser(String newUser, String password1) {
        this.userRepository.save(new User(newUser, password1));
    }


}
