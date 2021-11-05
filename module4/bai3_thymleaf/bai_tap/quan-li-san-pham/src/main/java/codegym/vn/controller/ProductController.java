package codegym.vn.controller;

import codegym.vn.model.Product;
import codegym.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("listProduct",productService.findAll());
        return "index";
    }
    // hien thi form tao moi
    @GetMapping("/product/create")
    public String showCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/product/save")
    private String createProduct(Product product, RedirectAttributes redirectAttributes){
        product.setId((int)(Math.random()*1000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("messAdd","Add new product success !!!");
        return "redirect:/list";
    }
    // hien thi thong tin product
    @GetMapping("/product/{id}/views")
    public String detail(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }
    // hien thi form edit
    @GetMapping("/product/{id}/edit")
    public String editForm(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }
    // update product
    @PostMapping("/product/update")
    public String update(Product product,RedirectAttributes redirectAttributes){
        productService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("messEdit","Edit Success !!!");
        return "redirect:/list";
    }
    // hien thi form xac nhan xoa
    @GetMapping("/product/{id}/delete")
    public String deleteForm(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "delete";
    }
    @PostMapping("/product/delete")
    public String delete(Product product,RedirectAttributes redirectAttributes){
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("messDelete","Delete Success !!!" );
        return "redirect:/list";
    }
}
