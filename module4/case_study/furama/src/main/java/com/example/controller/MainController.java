package com.example.controller;

import java.security.Principal;
import java.sql.SQLIntegrityConstraintViolationException;


import com.example.model.AppUser;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class MainController {

    @GetMapping("/home")
    public String homePage(@ModelAttribute("user")AppUser appUser) {
        return "index";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:/home";
//        Edit after learning Spring security lesson
    }
    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "403";
    }
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public String sqlDeleteHandler(){
        return "sql-error-page";
    }

    @ExceptionHandler(Exception.class)
    public String viewErrorPage() {
        return "error-page";
    }

}