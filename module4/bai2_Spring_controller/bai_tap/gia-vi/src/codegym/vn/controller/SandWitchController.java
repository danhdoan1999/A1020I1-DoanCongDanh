package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandWitchController {
    private List<String> condimentList = new ArrayList<>();
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("condimentList",condimentList);
        return "index";
    }
    @GetMapping("/create")
    public String createForm(){
        return "create";
    }
    @PostMapping("/create")
    private String create(@RequestParam("condiment") String condiment){
        condimentList.add(condiment);
        return "redirect:/";
    }
}
