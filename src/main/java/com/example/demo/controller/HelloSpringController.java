package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloSpringController {

    @GetMapping("/hello")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    
    public String hello(){
        //HTMLテンプレートにhello-spring.htmlを指定
        return "hello-spring";
    }
}
