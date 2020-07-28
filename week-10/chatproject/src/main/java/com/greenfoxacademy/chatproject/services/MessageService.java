package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.viewmodels.MessageDisplayDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MessageService {

   void postMessage(String message);

    List <MessageDisplayDTO> getMyMessages();

    void reloadAll();
}
