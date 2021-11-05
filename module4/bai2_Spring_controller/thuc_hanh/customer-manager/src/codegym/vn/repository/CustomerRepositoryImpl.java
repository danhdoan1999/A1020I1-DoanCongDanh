package codegym.vn.repository;

import codegym.vn.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private static Map<String,Customer> list = new TreeMap<>();
    static {
        list.put("KH1",new Customer("KH1","Danh","danhdoan1999","Da nang"));
        list.put("KH2",new Customer("KH2","Hieu","hieutrong3399","Hue"));
        list.put("KH3",new Customer("KH3","Huy","huyboykute191","Da nang"));
        list.put("KH4",new Customer("KH4","Duy","duysiri1999","Ha noi"));
    }

    @Override
    public List<Customer> showAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public Customer findById(String id) {
        return list.get(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        list.put(customer.getId(),customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        if(list.containsKey(customer.getId())){
            list.put(customer.getId(),customer);
        }
    }
}
