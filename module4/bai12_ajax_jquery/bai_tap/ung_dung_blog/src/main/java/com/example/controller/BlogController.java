package com.example.controller;

import com.example.model.Blog;
import com.example.model.Category;
import com.example.service.BlogService;
import com.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public List<Category> categories(){
        return categoryService.findAll();
    }

    @GetMapping(value = {"/", "/blog"})
    public String showList(@RequestParam("keyword") Optional<String> author,
                           @RequestParam("keyword") Optional<String> title,
                           @RequestParam("categoryId") Optional<Integer> categoryId,
                           @PageableDefault(value = 3) Pageable pageable,
                           Model model){
        Page<Blog> blogs;
        model.addAttribute("categories", categoryService.findAll());
        // kiểm tra đk trong form tìm kiếm có giá trị author hoặc title ko ?
        if (!author.isPresent() || !title.isPresent()){
            // kiểm tra tiếp bộ lọc category có giá trị ko ?
            if (categoryId.isPresent()){
                blogs = blogService.findAllByCategory(categoryId.get(), pageable);
                model.addAttribute("blogList", blogs);
                model.addAttribute("categoryId", categoryId.get());
                return "blog/list";
            }
            blogs = blogService.findAll(pageable);
        }
        else {
            blogs = blogService.findAllByAuthorContainingOrTitleContaining(author.get(), title.get(), pageable);
        }
        model.addAttribute("blogList", blogs);
        return "blog/list";
    }

    @GetMapping("/blog/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/blog/create")
    public String saveCustomer(@ModelAttribute("customer") Blog blog, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message", "Create Blog success");
        blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/edit";
    }

    @PostMapping("/blog/update")
    public String update(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.update(blog);
        redirectAttributes.addFlashAttribute("message", "Update blog success");
        return "redirect:/";
    }

    @GetMapping("/blog/delete/{id}")
    public String delete(@PathVariable("id") int id, RedirectAttributes redirectAttributes){
        Blog blog = blogService.findById(id);
        if (blog != null){
            redirectAttributes.addFlashAttribute("message", "Delete blog success");
            blogService.remove(blog);
        } else {
            redirectAttributes.addFlashAttribute("message", "Blog not found");
        }
        return "redirect:/";
    }

    @GetMapping("/blog/show/{id}")
    public String showinfo(@PathVariable("id") int id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blogInfo", blog);
        return "blog/show";
    }

    @GetMapping(value = "/search/{value}")
    public ModelAndView searchByTitle(@PathVariable String value){
        List<Blog> blogList = blogService.findAllByTitleContaining('%'+value+'%');
        ModelAndView modelAndView = new ModelAndView("blog/listSearch");
        modelAndView.addObject("blogList",blogList);
        if (blogList.size()==0) {
            modelAndView.addObject("msg", "Không tìm ra bài viết này.");
        }
        return modelAndView;
    }
}
