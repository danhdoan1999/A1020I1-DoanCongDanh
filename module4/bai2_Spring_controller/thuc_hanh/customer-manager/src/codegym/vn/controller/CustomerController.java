package codegym.vn.controller;

import codegym.vn.model.Customer;
import codegym.vn.service.CustomerService;
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
    CustomerService customerService ;
    @GetMapping("/list")
    public String getIndex(Model model){
        model.addAttribute("listCustomer",customerService.showAll());
        return "index";
    }
    // show information customer
    @GetMapping("/customerInfo/{id}")
    private String getInfo(@PathVariable("id") String id, Model model){
        model.addAttribute("info",customerService.findById(id));
        return "detail";
    }
    // gui form edit customer
    @GetMapping("/edit-form/{id}")
    private String editForm(@PathVariable("id") String id , Model model){
        model.addAttribute("info",customerService.findById(id));
        return "edit";
    }
    // edit customer
    @PostMapping("/edit/{id}")
    private String editCustomer(@PathVariable("id") String id , @RequestParam String name ,
                                @RequestParam String email,     @RequestParam String address, Model model){
        Customer customer = customerService.findById(id);
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        customerService.updateCustomer(customer);
        return "redirect:/list";
    }
}
