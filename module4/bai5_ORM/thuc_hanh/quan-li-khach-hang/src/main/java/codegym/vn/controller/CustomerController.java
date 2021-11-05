package codegym.vn.controller;

import codegym.vn.model.Customer;
import codegym.vn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public String getList(Model model){
        model.addAttribute("customerList",customerService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String getCreateForm(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/save")
    public String create(RedirectAttributes redirectAttributes, Customer customer){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("addNewSuccess","Add New Customer Success !!!");
        return "redirect:/create";
    }
    @GetMapping("{id}/view")
    public String view(@PathVariable("id") int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "view";
    }
    @GetMapping("{id}/edit")
    public String editForm(@PathVariable("id") int id , Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String edit(Customer customer, RedirectAttributes redirectAttributes){
        customerService.update(customer.getId(),customer);
        redirectAttributes.addFlashAttribute("updateSuccess","Update Customer Success !!! ");
        return "redirect:/";
    }
    @GetMapping("{id}/delete")
    public String deleteForm(@PathVariable("id") int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(Customer customer,RedirectAttributes redirectAttributes){
        customerService.delete(customer);
        redirectAttributes.addFlashAttribute("delete","Delete Success !!!");
        return "redirect:/";
    }
}
