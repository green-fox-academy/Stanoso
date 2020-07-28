package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.User;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserServiceImpl implements UserService {

    User user = null;


    @Override
    public String[] registerUser(String userName, String password1, String password2) {
        String[] result = new String[2];
        if (!password1.equals(password2)) {
            result[0] = "passKO";
            result[1] = "Passwords don´t match. Set it again.";
            return result;
        }
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/user/register";
        Map<String, Object> data = new HashMap<>();
        data.put("login", userName);
        data.put("password", password1);

        try {
            ResponseEntity<?> response = restTemplate.postForEntity(url, data, User.class);
            user = (User) response.getBody();
            user = null;
            loginUser(userName, password1);
            return result;
        } catch (HttpServerErrorException e) {
            result[0] = "userExists";
            result[1] = "User name already taken. Choose different one.";
            return result;
        }

    }

    @Override
    public String[] loginUser(String userName, String password) {
        String[] result = new String[2];
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/user/login";
        Map<String, Object> data = new HashMap<>();
        data.put("login", userName);
        data.put("password", password);
        try {
            ResponseEntity<?> response = restTemplate.postForEntity(url, data, User.class);
            User apiKey = (User) response.getBody();
            user = new User(userName, null, apiKey.getApiKey(), null);
            result[0] = "OK";
            result[1] = "User " + userName + " was succesfully logged in.";
            return result;
        } catch (HttpServerErrorException e) {
            result[0] = "KO";
            result[1] = "User " + userName + " doesn´t exist or you set a wrong password. Try again or register new user.";
            return result;
        }
    }

    @Override
    public Boolean isUserLogged() {
        if (user == null) {
            return false;
        }
        return true;
    }

    @Override
    public String[] getIndexPageStatuses() {
        String[] statuses = new String[5];
        //0 = userName/null
        //1 = logout/login
        //2 = update/null
        //3 = null / register new user
        //4 = url / Not set
        if (user == null) {
            statuses[0] = null;
            statuses[1] = "login";
            statuses[2] = null;
            statuses[3] = "register a new user";
            statuses[4] = "Avatar URL not set.";
            return statuses;
        }
        statuses[0] = user.getUsername();
        statuses[1] = "logout";
        statuses[2] = "update";
        statuses[3] = null;
        statuses[4] = this.user.getAvatarUrl();
        if (statuses[4] == null) {
            statuses[4] = "Avatar URL not set.";
        }
        return statuses;
    }

    @Override
    public void logoutUser() {
        this.user = null;
    }

    @Override
    public String updateUser(String userName, String url) {
        String result = "";
        if (userName.equals("") && url.equals("")) {
            result = "You have provided no new data.";
            return result;
        }
        if (userName.equals("")) {
            userName = this.user.getUsername();
        }
        if (url.equals("") && !this.user.getAvatarUrl().equals("")) {
            url = this.user.getAvatarUrl();
        }
        RestTemplate restTemplate = new RestTemplate();
        String urlHeroku = "https://rascals-chat.herokuapp.com/api/user/update";
        Map<String, Object> data = new HashMap<>();
        data.put("username", userName);
        data.put("avatarurl", url);
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey", this.user.getApiKey());
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(data, headers);

        try {
            ResponseEntity<?> response = restTemplate.postForEntity(urlHeroku, requestEntity, String.class);
            //User updatedUser = (User) response.getBody();
            this.user.setUsername(userName);
            this.user.setAvatarUrl(url);
            result = "User succesfully updated.";
            return result;
        } catch (HttpServerErrorException e) {
            result = "User name already taken. Choose different one.";
            return result;
        }
    }

    @Override
    public String getApiKey() {
        return this.user.getApiKey();
    }
}
