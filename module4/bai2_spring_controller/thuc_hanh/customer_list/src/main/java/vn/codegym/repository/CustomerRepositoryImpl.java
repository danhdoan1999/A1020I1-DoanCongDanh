package vn.codegym.repository;

import vn.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList;
    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Danh","danhdoan1999@gmail.com","Da nang"));
        customerList.add(new Customer(2,"Hoang","hoang1999@gmail.com","Hue"));
        customerList.add(new Customer(3,"Hieu","hieu1999@gmail.com","Ha noi"));
    }
    @Override
    public List<Customer> finAll() {
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer.getId(),customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.set(id,customer);
    }
}
