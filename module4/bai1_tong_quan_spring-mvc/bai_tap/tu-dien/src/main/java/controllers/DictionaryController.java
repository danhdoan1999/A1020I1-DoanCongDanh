package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
public class DictionaryController {
    @GetMapping("/")
    public String getHome(){
        return "index";
    }
    @RequestMapping(value = "/dictionary",method = RequestMethod.GET)
    public String getResult(@RequestParam("word") String word , ModelMap modelMap){
        Map<String,String> mapList = new HashMap<>();
        mapList.put("handsome","dep trai");
        mapList.put("pink","mau hong");
        mapList.put("yellow","mau vang");
        mapList.put("red","mau do");
        String result = mapList.get(word);
        if(result != null){
            modelMap.addAttribute("result", result);
        }else{
            modelMap.addAttribute("result","not found!!!");
        }
        return "index";
    }
}
