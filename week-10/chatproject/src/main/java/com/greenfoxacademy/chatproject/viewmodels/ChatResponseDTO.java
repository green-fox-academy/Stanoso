package com.greenfoxacademy.chatproject.viewmodels;

import com.greenfoxacademy.chatproject.models.Channel;

import java.util.List;

public class ChatResponseDTO {

    private List<MessageResponseDTO> messages;
    private Channel Channel;

    public ChatResponseDTO(List<MessageResponseDTO> messages, com.greenfoxacademy.chatproject.models.Channel channel) {
        this.messages = messages;
        this.Channel = channel;
    }

    public ChatResponseDTO() {
    }

    public List<MessageResponseDTO> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageResponseDTO> messages) {
        this.messages = messages;
    }

    public com.greenfoxacademy.chatproject.models.Channel getChannel() {
        return Channel;
    }

    public void setChannel(com.greenfoxacademy.chatproject.models.Channel channel) {
        Channel = channel;
    }
}
