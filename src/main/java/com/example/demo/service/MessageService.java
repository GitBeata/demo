package com.example.demo.service;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
@Autowired
    private MessageRepository messageRepository;
// find i save to standardowe operacje w tym serwisie. Wstrzykujemy message repository

    public List<Message> findAllMessages() {
        return  messageRepository.findAll();

    }
    //zapis
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

}
