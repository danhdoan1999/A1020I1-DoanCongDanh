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

import java.util.Optional;

@Controller
public class ContractController {

    @Autowired
    private ContractService contractService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private AttachServiceService attachServiceService;
    @Autowired
    private ContractDetailService contractDetailService;

    @ModelAttribute("attachService")
    public Iterable<AttachService> getAttachService(){
        return attachServiceService.findAll();
    }
    @ModelAttribute("contractIter")
    public Iterable<Contract> getContract(){
        return contractService.findAll();
    }
    @ModelAttribute("employeeContract")
    public Iterable<Employee> getEmployee(){
        return employeeService.findAll();
    }
    @ModelAttribute("customerContract")
    public Iterable<Customer> getCustomer(){
        return customerService.findALl();
    }
    @ModelAttribute("serviceContract")
    public Iterable<Service> getService(){
        return serviceService.findALl();
    }

    @GetMapping("/contract")
    public String showList(@RequestParam("keyword") Optional<String> nameEmployee,
                           @RequestParam("keyword") Optional<String> nameCustomer,
                           @RequestParam("keyword") Optional<String> nameService,
                           Model model, @PageableDefault(value = 7) Pageable pageable){
        Page<Contract> contractList;
        if(!nameEmployee.isPresent() || !nameCustomer.isPresent()  ){
            contractList = contractService.findAll(pageable);
        }else{
            contractList = contractService.findAllByEmployee_NameOrCustomer_NameOrService_Name(nameEmployee.get(), nameCustomer.get(),nameService.get(), pageable);
        }
        model.addAttribute("contractList",contractList);
        return "contract/list";
    }
    @GetMapping("/contract/create-form-contract")
    public String showFormCreate(Model model){
        model.addAttribute("contract",new Contract());
        return "contract/create-contract";
    }
    @PostMapping("/contract/create")
    public String createContract(@Validated @ModelAttribute("contract") Contract contract , BindingResult bindingResult , RedirectAttributes redirectAttributes,Service service,ContractDetail contractDetail){
       if(bindingResult.hasFieldErrors()){
           return "contract/create-contract";
       }else{
           Double total = service.getServiceCost();
           contract.setContractDeposit(total);
           Double totalAllMoney = 0.0 + total;
           contract.setContractTotalMoney(totalAllMoney);
           contractService.save(contract);
           redirectAttributes.addFlashAttribute("message", contract.getContractId());
           return "redirect:/contract";
       }
    }
    @GetMapping("/contract/create-detail")
    public String createDetail(Model model){
        model.addAttribute("contractDetail",new ContractDetail());
        return "contract/create-detail-contract";
    }

    @PostMapping("/contract-detail/save")
    public String saveContractDetail(@Validated @ModelAttribute("contractDetail") ContractDetail contractDetail,BindingResult bindingResult,RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "contract/create-detail-contract";
        }else{
            contractDetail.getContract().setContractTotalMoney(contractDetail.totalAll());
            contractDetailService.save(contractDetail);
            redirectAttributes.addFlashAttribute("addSuccess", contractDetail.getContractDetailId());
            return "redirect:/contract";
        }
    }

    @GetMapping("/contract-detail/view")
    public String showListDetailContract(@RequestParam("keyword") Optional<String> nameCustomer,
                                         @RequestParam("keyword") Optional<String> idCustomer,
                                         Model model, @PageableDefault(value = 7) Pageable pageable){
        Page<ContractDetail> contractDetailList;
        if(!nameCustomer.isPresent() || !idCustomer.isPresent()){
            contractDetailList = contractDetailService.findAll(pageable);
        }else {
            contractDetailList = contractDetailService.findAllByCustomer_NameOrCustomer_CustomerId(nameCustomer.get(),idCustomer.get(),pageable);
        }
        model.addAttribute("contractDetailList",contractDetailList);
        return "contract/view";
    }
}
