package model.service;

import model.bean.Product;

import java.util.List;

public interface ProductService {
List<Product> showAll();

void createProduct(Product product);

void update();

void remove();

Product detail();

Product searchById();

}
