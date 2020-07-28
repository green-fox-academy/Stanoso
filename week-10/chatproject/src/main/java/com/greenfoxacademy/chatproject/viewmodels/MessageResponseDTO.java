package com.greenfoxacademy.chatproject.viewmodels;

import com.greenfoxacademy.chatproject.models.User;

import java.time.Instant;

public class MessageResponseDTO {

    private String content;
    private String created;
    private User author;

    public MessageResponseDTO(String content, String created, User author) {
        this.content = content;
        this.created = created;
        this.author = author;
    }

    public MessageResponseDTO() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
