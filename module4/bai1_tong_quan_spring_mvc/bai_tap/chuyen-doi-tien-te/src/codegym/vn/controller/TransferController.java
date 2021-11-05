package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransferController {
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
    @PostMapping("/transfer")
    public String getResult(@RequestParam(name = "number") int number, Model model){
        int result = number*23000;
        model.addAttribute("result", result);
        return "index";
    }
}
