package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("messages", messageService.findAllMessages());
        return "index";  // Ładowanie widoku z wiadomościami
    }

    @PostMapping("/addMessage")
    public String addMessage(@RequestParam("content") String content, Model model) {
        Message newMessage = new Message();
        newMessage.setContent(content);
        messageService.saveMessage(newMessage);
        return "redirect:/";  // Przekierowanie na stronę główną po dodaniu wiadomości
    }

    @PostMapping("/deleteMessage")
    public String deleteMessage(@RequestParam("id") Long id) {
        messageService.deleteMessageById(id);  // Usuwanie wiadomości przez id
        return "redirect:/";  // Przekierowanie na stronę główną po usunięciu wiadomości
    }
}