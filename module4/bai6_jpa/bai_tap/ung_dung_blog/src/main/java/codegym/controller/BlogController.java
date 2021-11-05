package codegym.controller;

import codegym.model.Blog;
import codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("blogList",blogService.showAll());
        return "index";
    }
    @GetMapping("/create-form")
    public String showFormCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","Add new Blog success");
        return "redirect:/";
    }
    @GetMapping("/show/{id}")
    public String detailBlog(@PathVariable("id") int id , Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "detail";
    }
    @GetMapping("/edit/{id}")
    public String updateForm(@PathVariable("id") int id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog , Model model){
        blogService.update(blog);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String remove(@PathVariable("id") int id){
        Blog blog = blogService.findById(id);
        blogService.delete(blog);
        return "redirect:/";
    }
}
