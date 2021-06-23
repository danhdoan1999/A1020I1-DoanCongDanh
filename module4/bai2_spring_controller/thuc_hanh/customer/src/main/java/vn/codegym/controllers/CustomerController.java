package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.service.CustomerService;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView getListCustomer(){
        return new ModelAndView("list","customerList",customerService.finAll());
    }
}
