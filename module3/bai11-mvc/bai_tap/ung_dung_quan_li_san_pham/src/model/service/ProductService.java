package model.service;

import model.bean.Product;

import java.util.List;

public interface ProductService {
List<Product> showAll();

void createProduct(Product product);

void update(int id, Product product);

void remove(int id);

Product searchById(int id);

}
