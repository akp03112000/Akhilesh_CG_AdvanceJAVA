package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Swagger!";
    }

    @GetMapping("/name")
    public String name() {
        return "Akhilesh Prajapati";
    }

    @GetMapping("/course")
    public String course() {
        return "MTech Data Science";
    }
}