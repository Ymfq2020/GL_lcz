package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:80/hello
    // http://localhost:80/hello?nickname=zhangsan&phone=1234
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    // @GetMapping("/hello")
    public String hello(String nickname,String phone){
        System.out.println(phone);
        return "你好" + nickname;
    }
}
