package me.chanjar.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String handler(Model model) {
        //return "Hello Spring Boot";
        throw new RuntimeException("test exception");
    }
}