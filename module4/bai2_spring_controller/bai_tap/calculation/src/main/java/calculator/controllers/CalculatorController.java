package calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String getCalculation(){
        return "index";
    }
    @PostMapping("/calculator")
    public String getResult(){
        return "index";
    }
}
