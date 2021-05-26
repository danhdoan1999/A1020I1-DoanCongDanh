package model.service;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"Iphone 11","500$","pink","usa"));
        productMap.put(2,new Product(2,"Samsung j7","400$","green","thailand"));
        productMap.put(3,new Product(3,"B phone","300$","red","vietnam"));
        productMap.put(4,new Product(4,"Oppo f1 plus","100$","yellow","china"));
        productMap.put(5,new Product(5,"Samsung j5","450$","blue","korean"));
    }
    @Override
    public List<Product> showAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void createProduct(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void update(int id , Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product searchById(int id) {
        return productMap.get(id);
    }
}
