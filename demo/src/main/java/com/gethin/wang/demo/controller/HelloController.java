package com.gethin.wang.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String hello(){
        return "hello world!";
    }
}