package com.eumemu.parkingcloudproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "hello DIO.. Java Developers tudo bem?";
    }
}
