package codegym.vn.controller;

import codegym.vn.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
    @PostMapping("/calculator")
    public String getResult(@RequestParam("operator") String operator,@RequestParam("firstNum") double firstNum
                            ,@RequestParam("secondNum") double secondNum, Model model){
        Calculator calculator = new Calculator(firstNum,secondNum,operator);
        double result = calculator.result();
        model.addAttribute("result",result);
        return "index";
    }
}
