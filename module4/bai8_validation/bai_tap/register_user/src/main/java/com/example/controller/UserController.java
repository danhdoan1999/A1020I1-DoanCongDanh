package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/validateUser")
    public String getResult(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
    if (bindingResult.hasFieldErrors()){
        return "index";
    }
    return "result";
    }
}
