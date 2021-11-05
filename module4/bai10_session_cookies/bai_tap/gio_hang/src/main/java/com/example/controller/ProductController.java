package com.example.controller;

import com.example.model.Cart;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("carts")
public class ProductController {
    @Autowired
    ProductService productService;

    @ModelAttribute("carts")
    public HashMap<Long, Cart> showInfoCart(){
        return new HashMap<>();
    }

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("listFlower",productService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/create-product")
    public String createProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message","add product success !!!");
        return "redirect:/create";
    }
    @GetMapping("/view-product/{id}")
    public String viewProduct(@PathVariable Long id , Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "view";
    }
    @GetMapping("/buy/{id}")
    public String addToCart(@PathVariable("id") Long id, @SessionAttribute("carts") HashMap<Long,Cart> cartHashMap, Model model ){
        // trường hợp cart trống
        if(cartHashMap == null){
            cartHashMap = new HashMap<>();
        }
        Product product = productService.findById(id);
        // trường hợp card có sẵn product
        if (cartHashMap != null){
            Cart item;
            if (cartHashMap.containsKey(id)){
                item = cartHashMap.get(id);
                item.setQuantity(item.getQuantity() + 1);
                cartHashMap.put(id,item);
            }else {
                item = new Cart();
                item.setProduct(product);
                item.setQuantity(1);
                cartHashMap.put(id,item);
            }
        }
        model.addAttribute("listFlower",productService.findAll());
        model.addAttribute("carts",cartHashMap);
        model.addAttribute("cartNum",cartHashMap.size());
        return "list";
    }
    @GetMapping("/show-cart")
    public String showCart(@SessionAttribute("carts") HashMap<Long,Cart> cartHashMap,Model model){
        model.addAttribute("carts",cartHashMap);
        model.addAttribute("cartNum",cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "cart";
    }

    @GetMapping("/delete/{id}")
    public String deleteProductInCart(@PathVariable Long id,@SessionAttribute("carts") HashMap<Long,Cart> cartHashMap , Model model){
        if (cartHashMap == null){
            cartHashMap = new HashMap<>();
        }
        cartHashMap.remove(id);
        model.addAttribute("carts", cartHashMap);
        model.addAttribute("cartNum", cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "cart";
    }

    public double totalPrice(HashMap<Long,Cart> cartHashMap){
        int count = 0 ;
        for(Map.Entry<Long,Cart> list:cartHashMap.entrySet()){
            count += Double.parseDouble(list.getValue().getProduct().getNewPrice())*list.getValue().getQuantity();
        }
        return count;
    }
}
