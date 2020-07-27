package com.greenfoxacademy.chatproject.models;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.net.URL;

public class User {

    private String username;
    private Long userId;
    private String apiKey;
    private String avatarUrl;

    public User() {
    }

    public User(String username, Long userId, String apiKey, String avatarUrl) {
        this.username = username;
        this.userId = userId;
        this.apiKey = apiKey;
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
