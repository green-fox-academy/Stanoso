package com.greenfoxacademy.chatproject.viewmodels;

public class MessageDisplayDTO {

    private String channelId;
    private String content;
    private String date;
    private String time;
    private String userName;
    private String avatarUrl;

    public MessageDisplayDTO(String channelId, String content, String date, String time, String userName, String avatarUrl) {
        this.channelId = channelId;
        this.content = content;
        this.date = date;
        this.time = time;
        this.userName = userName;
        this.avatarUrl = avatarUrl;
    }

    public MessageDisplayDTO() {
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
