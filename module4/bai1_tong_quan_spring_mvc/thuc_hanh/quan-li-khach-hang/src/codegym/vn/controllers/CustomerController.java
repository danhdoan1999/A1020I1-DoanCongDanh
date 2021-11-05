package codegym.vn.controllers;

import codegym.vn.service.CustomerService;
import codegym.vn.service.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/list")
    public String getIndex(Model model ){
        model.addAttribute("customerList", customerService.findAll());
        return "index";
    }
    @GetMapping("/info/{id}")
    public String getInfo(@PathVariable("id") String id , Model model){
        model.addAttribute("customerInfo",customerService.findById(id));
        return "info";
    }
}
