package model.service;

import model.bean.Customer;
import model.repository.Customer.CustomerRepository;
import model.repository.Customer.CustomerRepositoryIml;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceIml implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryIml();
    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        customerRepository.insertCustomer(customer);
    }

    @Override
    public List<Customer> selectAllCustomer() throws SQLException{
        return customerRepository.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        return customerRepository.getCustomerById(id);
    }
}
