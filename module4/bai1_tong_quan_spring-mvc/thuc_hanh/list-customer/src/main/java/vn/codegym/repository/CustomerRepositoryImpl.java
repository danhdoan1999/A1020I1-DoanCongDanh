package vn.codegym.repository;

import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList;
    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Danh","danhdoan19999@gmail.com","Da Nang"));
        customerList.add(new Customer(2,"Huy","hieu19999@gmail.com","Hue"));
        customerList.add(new Customer(3,"Hieu","huy@gmail.com","Ha Noi"));
    }
    @Override
    public List<Customer> listAll() {
        return customerList;
    }
}
