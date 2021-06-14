package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransferController {
    @GetMapping ("/")
    public String transfer(){
        return "index";
    }
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(@RequestParam("number") int numberTransfer, Model model){
        double result = numberTransfer * 23000;
        model.addAttribute("resultTransfer",result);
        return "index";
    }
}
