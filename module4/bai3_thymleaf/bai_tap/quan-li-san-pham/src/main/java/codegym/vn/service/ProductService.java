package codegym.vn.service;

import codegym.vn.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);

    void update(int id,Product product);

    void remove(int id);
}
