package codegym.vn.repository.impl;

import codegym.vn.model.Customer;
import codegym.vn.repository.CustomerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    public static HashMap<String,Customer> customerList ;

    static {
        customerList = new HashMap<>();
        customerList.put("KH1",new Customer("KH1","Danh","danhdoan1999","Da nang"));
        customerList.put("KH2",new Customer("KH2","Cuong","cuong1992","Da nang"));
        customerList.put("KH3",new Customer("KH3","Thao","thaotran1992","Hue"));
        customerList.put("KH4",new Customer("KH4","Hieu","hieu2000","Quang nam"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList.values());
    }

    @Override
    public Customer findById(String id) {
        return customerList.get(id);
    }
}
