package com.example.controller;

import com.example.model.*;
import com.example.service.*;
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
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    EducationService educationService;
    @Autowired
    DivisionService divisionService;


    @ModelAttribute("positionTypes")
    public Iterable<Position> positionTypes(){
        return positionService.findAll();
    }
    @ModelAttribute("educationTypes")
    public Iterable<EducationDegree> educationType(){
        return educationService.findAll();
    }
    @ModelAttribute("divisionTypes")
    public Iterable<Division> divisionType(){
        return divisionService.findAll();
    }


    @GetMapping("/employee")
    public String showListEmployee(@RequestParam("keyword") Optional<String> name , Model model , @PageableDefault(value = 7) Pageable pageable){
        Page<Employee> employeeList;
        if(!name.isPresent()){
            employeeList = employeeService.findAll(pageable);
        }else{
            employeeList = employeeService.findAllByNameContaining(name.get(),pageable);
        }
        model.addAttribute("employeeList",employeeList);
        return "employee/list";
    }

    @GetMapping("/employee/create-form")
    public String showFormCreate(Model model){
        model.addAttribute("employee",new Employee());
        return "employee/create";
    }
    @PostMapping("/employee/create")
    public String create(@Validated @ModelAttribute("employee") Employee employee , BindingResult bindingResult , Model model , RedirectAttributes redirectAttributes) throws ParseException {
        if (bindingResult.hasFieldErrors()){
            return "/employee/create";
        }else{
            String id = "NV-" + ((int) (Math.random()*9999));
            employee.setEmployeeId(id);
            employeeService.save(employee);
            model.addAttribute("employee",new Employee());
            redirectAttributes.addFlashAttribute("message","New employee has added to your List  !!! ");
            return "redirect:/employee/create-form";
        }
    }
    @GetMapping("/employee/edit/{id}")
    public String showFormEdit(@PathVariable String id , Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee",employee);
        return "employee/edit";
    }
    @PostMapping("/employee/update")
    public String updateCustomer(@Validated Employee employee , BindingResult bindingResult,RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "employee/edit";
        }else{
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("message",employee.getEmployeeId());
            return "redirect:/employee";
        }
    }
    @GetMapping("/employee/delete/{id}")
    public String removeCustomer(@PathVariable String id ){
        Employee employee = employeeService.findById(id);
        employeeService.delete(employee);
        return "redirect:/employee";
    }
}
