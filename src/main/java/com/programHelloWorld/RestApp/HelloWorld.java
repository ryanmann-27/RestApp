package com.programHelloWorld.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index(){
        String s = "Hello World! This is my very first Spring Boot class - Ryan Mann";
        return s;
    }
}
