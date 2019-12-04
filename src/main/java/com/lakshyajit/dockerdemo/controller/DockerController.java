package com.lakshyajit.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/home")
    public String getMyName(){
        return "Simple Spring Boot Application";
    }
}
