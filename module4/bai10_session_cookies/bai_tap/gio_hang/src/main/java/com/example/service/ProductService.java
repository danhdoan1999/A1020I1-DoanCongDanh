package com.example.service;


import com.example.model.Product;

public interface ProductService {
    Iterable<Product> findAll();
    Product findById(Long id);
    void save(Product product);
    void remove(Long id);
}
