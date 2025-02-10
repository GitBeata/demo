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

    public List<Message> findAllMessages() {
        return messageRepository.findAll();  // Zwracanie wszystkich wiadomości
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);  // Zapisywanie wiadomości
    }

    public void deleteMessageById(Long id) {
        messageRepository.deleteById(id);  // Usuwanie wiadomości po id
    }
}
