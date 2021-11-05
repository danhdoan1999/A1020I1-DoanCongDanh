package codegym.vn.repository;

import codegym.vn.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private  static Map<Integer,Product> list ;

    static {
        list = new HashMap<>();
        list.put(1,new Product(1,"Iphone 11", 899,"China"));
        list.put(2,new Product(2,"Iphone 13", 1000,"USA"));
        list.put(3,new Product(3,"Samsung j7", 100,"Korea"));
        list.put(4,new Product(4,"Iphone 5", 150,"China"));
        list.put(5,new Product(5,"Iphone 6", 200,"USA"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public Product findById(int id) {
        return list.get(id);
    }

    @Override
    public void save(Product product) {
        list.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        list.put(product.getId(),product);
    }

    @Override
    public void remove(int id) {
        list.remove(id);
    }
}
