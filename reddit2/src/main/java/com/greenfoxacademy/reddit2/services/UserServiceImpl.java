package com.greenfoxacademy.reddit2.services;

import com.greenfoxacademy.reddit2.modells.User;
import com.greenfoxacademy.reddit2.repositories.UserRepository;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private HttpSession session;

    public UserServiceImpl(UserRepository userRepository, HttpSession session) {
        this.userRepository = userRepository;
        this.session = session;
    }


    @Override
    public User getCurrentUser() {
        return (User) session.getAttribute("user");
    }

    @Override
    public String save(String userName, String password1, String password2) {
        if (this.userRepository.findByUserName(userName) != null) {
            return "This User name exists. Please choose different.";
        }
        if (!password1.equals(password2)) {
            return "Passwords don´t match. Please set passwords once again.";
        }
        User newUser = new User(userName, password1);
        this.userRepository.save(newUser);
        session.setAttribute("user", newUser);
        return "ok";
    }

    @Override
    public String setLogStatus(User currentUser) {
        if (currentUser == null) {
            return "login";
        }
        return "logout";
    }

    @Override
    public String setCurrentUser(User currentUser) {
        if (currentUser != null) {
            return  currentUser.getUserName();
        }
        return null;
    }

    @Override
    public void logOut() {
        session.setAttribute("user",null);
    }

    @Override
    public String[] getVerifyUser(String user, String password) {
        String[] result = new String[2];
        User currentUser = this.userRepository.findByUserName(user);
        if (currentUser==null) {
            result[0] = "KO";
            result[1] = "This user doesn´t exist. Change User name or create a new user.";
        } else if (user.equals(currentUser.getUserName()) && password.equals(currentUser.getPassword())) {
            result[0] = "OK";
            result[1] = user;
            session.setAttribute("user", currentUser);
        } else if (user.equals(currentUser.getUserName())) {
            result[0] = "NameOk";
            result[1] = "Password doesn´t match with User name!";
        }
        return result;
    }

}
