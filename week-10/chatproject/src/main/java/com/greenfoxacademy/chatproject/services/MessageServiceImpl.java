package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.viewmodels.ChatResponseDTO;
import com.greenfoxacademy.chatproject.viewmodels.MessageDisplayDTO;
import com.greenfoxacademy.chatproject.viewmodels.MessageResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MessageServiceImpl implements MessageService {


    List<MessageDisplayDTO> listToPrint = new ArrayList<>();

    UserService userService;
    @Autowired
    DateTimeFormatter dateTimeFormatter;

    public MessageServiceImpl(UserService userService) {
        this.userService = userService;

    }

    @Override
    public void postMessage(String message) {


//        String result = "";
//        if (message.equals("") || message == null) {
//            result = "You have provided no new data.";
//            return result;
//        }
//        if (userName.equals("")) {
//            userName = this.user.getUsername();
//        }
//        if (url.equals("") && !this.user.getAvatarUrl().equals("")) {
//            url = this.user.getAvatarUrl();
//        }
        RestTemplate restTemplate = new RestTemplate();
        String urlHeroku = "https://rascals-chat.herokuapp.com/api/message/";
        Map<String, Object> data = new HashMap<>();
        data.put("channelId", null);
        data.put("channelSecret", null);
        data.put("content", message);
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey", this.userService.getApiKey());
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(data, headers);

        try {
            ResponseEntity<?> response = restTemplate.postForEntity(urlHeroku, requestEntity, MessageResponseDTO.class);
            reloadAll();


        } catch (HttpServerErrorException e) {

        }
    }

    @Override
    public List<MessageDisplayDTO> getMyMessages() {
        return this.listToPrint;
    }

    @Override
    public void reloadAll() {
        RestTemplate restTemplate = new RestTemplate();
        String urlHeroku = "https://rascals-chat.herokuapp.com/api/channel/get-messages";
        Map<String, Object> data = new HashMap<>();
        data.put("channelId", null);
        data.put("channelSecret", null);
        data.put("count", 100);
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey", this.userService.getApiKey());
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(data, headers);

        try {
            ResponseEntity<?> response = restTemplate.postForEntity(urlHeroku, requestEntity, ChatResponseDTO.class);
            ChatResponseDTO chatResponseDTO = (ChatResponseDTO) response.getBody();
            listToPrint.clear();
            for (MessageResponseDTO mRDTO : chatResponseDTO.getMessages()) {
                listToPrint.add(setMessageDisplayDTO(mRDTO));
            }


        } catch (
                HttpServerErrorException e) {

        }


    }

    private MessageDisplayDTO setMessageDisplayDTO(MessageResponseDTO messageResponseDTO) {
        MessageDisplayDTO messageDisplayDTO = new MessageDisplayDTO();
        messageDisplayDTO.setChannelId(null);
        messageDisplayDTO.setContent(messageResponseDTO.getContent());
        messageDisplayDTO.setDate(this.dateTimeFormatter.getDate(messageResponseDTO.getCreated()));
        messageDisplayDTO.setTime(this.dateTimeFormatter.getTime(messageResponseDTO.getCreated()));
        messageDisplayDTO.setUserName(messageResponseDTO.getAuthor().getUsername());
        messageDisplayDTO.setAvatarUrl(messageResponseDTO.getAuthor().getAvatarUrl());
        return messageDisplayDTO;
    }
}
