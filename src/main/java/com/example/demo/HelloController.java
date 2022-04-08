package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello/")
    public String sayHelloTwaran() {
        return "Hello Twaran batch 5 and 6, welcome to CICD Spring Boot demo !!!";
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello Twaran, welcome to demo !!";
    }
}
