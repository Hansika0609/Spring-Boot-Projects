package com.springboot.first_app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //HTTP GET reuqest

    //http://localhost:9090/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "HelloWorld";
    }
}
