package com.example.docker1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello1(){
        System.out.println("ffff");
        System.out.println("push");
         System.out.println("pull");
        return "hello yangdan123";
    }
}
