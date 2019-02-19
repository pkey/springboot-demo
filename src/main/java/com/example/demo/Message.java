package com.example.demo;

import org.springframework.data.annotation.Id;

public class Message {

    @Id
    public String id;

    public String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }
}