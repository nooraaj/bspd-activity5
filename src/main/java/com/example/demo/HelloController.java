package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello there?";
    }

    @GetMapping("/page1")
    public String page1() {
        return "Hello, this is page 1 of Java Spring Boot project.";
    }

}