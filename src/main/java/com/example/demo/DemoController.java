package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoRepository repo;

    @GetMapping(value = "/")
    public String helloWorld() {
        List<Message> messages = repo.findAll();
        Optional<Message> message = messages.stream().findFirst();
        return message.get().message;
    }
}