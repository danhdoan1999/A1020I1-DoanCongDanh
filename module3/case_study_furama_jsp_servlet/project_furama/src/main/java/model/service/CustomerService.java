package model.service;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    void insertCustomer(Customer customer) throws SQLException;
    List<Customer> selectAllCustomer() throws SQLException;
    boolean deleteCustomer(int id) throws SQLException;
    boolean updateCustomer(Customer customer) throws SQLException;
    Customer getCustomerById(int id) throws SQLException;
}
