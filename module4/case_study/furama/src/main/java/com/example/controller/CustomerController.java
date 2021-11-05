package com.example.controller;

import com.example.model.Customer;
import com.example.model.CustomerType;
import com.example.service.CustomerService;
import com.example.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("types")
    public Iterable<CustomerType> customerTypes(){
        return customerTypeService.findAll();
    }

    @GetMapping("/customer")
    public String showList(@RequestParam("keyword") Optional<String> name, Model model, @PageableDefault(value = 7)Pageable pageable){
        Page<Customer> customerList;
        if(!name.isPresent()){
            customerList = customerService.findAll(pageable);
        }else{
            customerList = customerService.findAllByNameContaining(name.get(),pageable);
        }
        model.addAttribute("customerList",customerList);
        return "customer/list";
    }
    @GetMapping("/customer/create-form")
    public String showFormAddCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "customer/create";
    }
    @PostMapping("/customer/create")
    public String createCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult , Model model , RedirectAttributes redirectAttributes) throws ParseException {
        if(bindingResult.hasFieldErrors()){
            return "customer/create";
        }else{
            String id = "KH-" + ((int) (Math.random()*9999));
            customer.setCustomerId(id);
            customerService.save(customer);
            model.addAttribute("customer",new Customer());
            redirectAttributes.addFlashAttribute("message","New customer has added to your List  !!! ");
            return "redirect:/customer/create-form";
        }
    }

    @GetMapping("/customer/edit/{id}")
    public String showFormEdit(@PathVariable String id , Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer",customer);
        return "customer/edit";
    }
    @PostMapping("/customer/update")
    public String updateCustomer(@Validated Customer customer , BindingResult bindingResult,RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "customer/edit";
        }else{
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message",customer.getCustomerId());
            return "redirect:/customer";
        }
    }
    @GetMapping("/customer/delete/{id}")
    public String removeCustomer(@PathVariable String id ){
        Customer customer = customerService.findById(id);
        customerService.delete(customer);
        return "redirect:/customer";
    }
}
