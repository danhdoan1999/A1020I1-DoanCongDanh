package com.example.controller;

import com.example.model.Customer;
import com.example.model.RentType;
import com.example.model.Service;
import com.example.model.ServiceType;
import com.example.service.RentTypeService;
import com.example.service.ServiceService;
import com.example.service.ServiceTypeService;
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
public class ServiceController {
    @Autowired
    ServiceService serviceService;
    @Autowired
    ServiceTypeService serviceTypeService;
    @Autowired
    RentTypeService rentTypeService;

    @ModelAttribute("serviceTypes")
    public Iterable<ServiceType> serviceTypes(){
        return serviceTypeService.findAll();
    }
    @ModelAttribute("rentTypes")
    public Iterable<RentType> rentTypes(){
        return rentTypeService.findAll();
    }
    @GetMapping("/service")
    public String showListService(@RequestParam("keyword") Optional<String> name , Model model , @PageableDefault(value = 7) Pageable pageable){
        Page<Service> serviceList;
        if(!name.isPresent()){
            serviceList = serviceService.findAll(pageable);
        }else{
            serviceList = serviceService.findAllByServiceNameContaining(name.get(),pageable);
        }
        model.addAttribute("serviceList",serviceList);
        return "service/list";
    }

    @GetMapping("/service/create-form")
    public String showFormCreate(Model model){
        model.addAttribute("service",new Service());
        return "service/create";
    }
    @PostMapping("/service/create")
    public String create(@Validated @ModelAttribute("service") Service service , BindingResult bindingResult , Model model , RedirectAttributes redirectAttributes) throws ParseException {
        if (bindingResult.hasFieldErrors()){
            return "/service/create";
        }else{
            String id = "DV-" + ((int) (Math.random()*9999));
            service.setServiceId(id);
            serviceService.save(service);
            model.addAttribute("service",new Service());
            redirectAttributes.addFlashAttribute("message","New service has added to your List  !!! ");
            return "redirect:/service/create-form";
        }
    }
    @GetMapping("/service/edit/{id}")
    public String showFormEdit(@PathVariable String id , Model model){
        Service service = serviceService.findById(id);
        model.addAttribute("service",service);
        return "service/edit";
    }
    @PostMapping("/service/update")
    public String updateCustomer(@Validated Service service , BindingResult bindingResult,RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "service/edit";
        }else{
            serviceService.save(service);
            redirectAttributes.addFlashAttribute("message",service.getServiceId());
            return "redirect:/service";
        }
    }
    @GetMapping("/service/delete/{id}")
    public String removeCustomer(@PathVariable String id ){
        Service service = serviceService.findById(id);
        serviceService.delete(service);
        return "redirect:/service";
    }
}
