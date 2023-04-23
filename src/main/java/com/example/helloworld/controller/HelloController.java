package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:80/hello
    @GetMapping("/hello")
    public String hello(){
        return "你好 世界1";
    }
}
