package com.malik.helloproject.MyFirstHelloWorldProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHello() {
        return ("hello World");
    }
}
