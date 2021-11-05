package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }
    @GetMapping("/login")
    public String showLoginForm(){
        return "login";
    }
}
