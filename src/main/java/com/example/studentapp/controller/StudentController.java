package com.example.studentapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from harish";
    }
}