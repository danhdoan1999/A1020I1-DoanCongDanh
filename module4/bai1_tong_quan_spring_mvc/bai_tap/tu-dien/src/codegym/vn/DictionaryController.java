package codegym.vn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class DictionaryController {
    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }
    @PostMapping("/translate")
    public String getTranslate(@RequestParam(name = "input") String inputSearch , Model model){
        HashMap<String,String> list = new HashMap<>();
        list.put("handsome","dep trai");
        list.put("hello","xin chao");
        list.put("danh doan","dep trai nhat the gian");
        list.put("green","xanh la");
        list.put("pink","mau hong");
        String result = list.get(inputSearch);
        if (inputSearch != null){
            model.addAttribute("result",result);
        }else{
            model.addAttribute("result","Not found");
        }
        return "index";
    }
}
