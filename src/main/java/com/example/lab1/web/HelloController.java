package com.example.lab1.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String numeAplicatie;
    public HelloController(@Value("${app.nume}") String numeAplicatie) {
        this.numeAplicatie = numeAplicatie;
    }
    @GetMapping("/")
    public String hello() {
        return "Salut din " + numeAplicatie + "!";
    }
}