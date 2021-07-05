package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping(value = {"/","/blog"})
    public ModelAndView getList(Model model){
        List<Blog> blogList = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        model.addAttribute("blogList",blogList);

        return modelAndView;

    }
    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }
    @PostMapping("/create")
    public String saveBlog(@ModelAttribute("blog") Blog blog , RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","add new blog success !!! ");
        blogService.save(blog);
        return "redirect:/";
    }
}
