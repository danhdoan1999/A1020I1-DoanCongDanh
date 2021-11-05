package codegym.controller;

import codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    @GetMapping("/")
    public String emailForm(Model model){
        model.addAttribute("email",new Email());
        List<String> listLanguage = new ArrayList<>();
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");
        model.addAttribute("listLanguage",listLanguage);
        List<Integer> listPageSize = new ArrayList<>();
        listPageSize.add(5);
        listPageSize.add(10);
        listPageSize.add(15);
        listPageSize.add(25);
        listPageSize.add(50);
        listPageSize.add(100);
        model.addAttribute("listPageSize",listPageSize);
        return "index";
    }
    @PostMapping("/settingEmail")
    public String resultEmail(@ModelAttribute("email") Email email , Model model){
        model.addAttribute("email",email);
        return "result";
    }
}
