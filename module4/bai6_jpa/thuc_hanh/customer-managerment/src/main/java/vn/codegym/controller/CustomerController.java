package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Customer;
import vn.codegym.service.CustomerService;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("customer",customerService.findAll());
        return "index";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","Add new Customer success !!!");
        return "redirect:/create";
    }
    @GetMapping("/views/{id}")
    public String view(@PathVariable int id ,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "view";
    }
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String update(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.update(customer);
        redirectAttributes.addFlashAttribute("message", "Update customer success");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, RedirectAttributes redirectAttributes){
        Customer customer = customerService.findById(id);
        if (customer != null){
            redirectAttributes.addFlashAttribute("message", "Delete customer success");
            customerService.remove(customer);
        } else {
            redirectAttributes.addFlashAttribute("message", "Customer not found");
        }
        return "redirect:/";
    }
    @GetMapping("/search")
    public ModelAndView searchCustomer(@RequestParam("search") String search){
        return new ModelAndView("index", "customer", customerService.searchByName(search));
    }
}
