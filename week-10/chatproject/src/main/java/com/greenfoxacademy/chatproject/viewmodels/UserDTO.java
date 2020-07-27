package com.greenfoxacademy.chatproject.viewmodels;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.net.URL;

public class UserDTO {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private URL avatarUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long userId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String login;


    public UserDTO (String login, String password) {
        this.login = login;
        this.password = password;
    }

}
