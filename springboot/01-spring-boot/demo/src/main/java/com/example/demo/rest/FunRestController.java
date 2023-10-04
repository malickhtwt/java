package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${messaging.tool}")
    private String messagingName;

    @Value("${language.name}")
    private String languageName;

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World</h1>";
    }

    // Endpoint that returns our custom properties
    @GetMapping("/custom-properties")
    public String getProperty() {
        return "Favorite Messaging Product: " + messagingName + ", Favorite Language: "
                + languageName;
    }
}
