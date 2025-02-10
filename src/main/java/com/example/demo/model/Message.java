package com.example.demo.model;
// java persistance api do zarządzania encją
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Message {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String content;

    // metody dostepowe, zwracamy wartośc pola getterami, settery - nowa wartość
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
