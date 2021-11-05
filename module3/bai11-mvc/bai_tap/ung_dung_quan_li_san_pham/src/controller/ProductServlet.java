package controller;

import model.bean.Product;
import model.service.ProductService;
import model.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" ,urlPatterns = {"","/products"})
public class ProductServlet extends HttpServlet {

    ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            default:
                listProducts(request,response);
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "remove":
                deleteProduct(request,response);
                break;
            case "detail":
                detailProduct(request,response);
                break;
            default:
                listProducts(request,response);
                break;
        }
    }

    // hàm để hiển thị các sản phẩm
    private void listProducts(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        // List<Product> products = productService.showAll();
        request.setAttribute("products",productService.showAll());
        try {
            request.getRequestDispatcher("product/list.jsp").forward(request,response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }
    // hàm để hiển thị form tạo mới sản phẩm khi người dùng nhấn vào tạo mới

    private void showCreateForm(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        try {
            request.getRequestDispatcher("product/create.jsp").forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }
    }
    // hàm để thêm sản phẩm mới vào
    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("nameProduct");
        String price = request.getParameter("priceProduct");
        String description = request.getParameter("description");
        String made = request.getParameter("madeBy");
        int id = (int)(Math.random()*10000);
        productService.createProduct(new Product(id,name,price,description,made));
        request.setAttribute("message","Create success");
        request.getRequestDispatcher("product/create.jsp").forward(request,response);
    }
    // ham de hien thi chi tiet san pham
    private void detailProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.searchById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("product/detail.jsp");
        }
        try{
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    // ham de xoa product
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
            this.productService.remove(id);
            try{
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    // ham de hien thi form edit , update san pham
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
         int id = Integer.parseInt(request.getParameter("id"));
         Product product = this.productService.searchById(id);
         RequestDispatcher dispatcher;
         if(product == null){
             dispatcher = request.getRequestDispatcher("error.jsp");
         }else {
             request.setAttribute("product",product);
             dispatcher = request.getRequestDispatcher("product/edit.jsp");
         }try{
             dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    // ham de update thong tin product
    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String price = request.getParameter("price");
    String description = request.getParameter("description");
    String madeBy = request.getParameter("madeBy");
    Product product = this.productService.searchById(id);
    RequestDispatcher dispatcher;
    if(product == null){
        dispatcher = request.getRequestDispatcher("error.jsp");
    }else {
        product.setNameProduct(name);
        product.setPriceProduct(price);
        product.setDescription(description);
        product.setMadeBy(madeBy);
        this.productService.update(id,product);
        request.setAttribute("product",product);
        request.setAttribute("message","Update success ! ");
        request.getRequestDispatcher("product/edit.jsp").forward(request,response);
    }
    }
}
