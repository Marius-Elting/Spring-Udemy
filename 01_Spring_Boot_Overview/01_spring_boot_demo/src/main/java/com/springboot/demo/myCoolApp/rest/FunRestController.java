package com.springboot.demo.myCoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"
    // this returns "hello world" in the browser
    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }
}
