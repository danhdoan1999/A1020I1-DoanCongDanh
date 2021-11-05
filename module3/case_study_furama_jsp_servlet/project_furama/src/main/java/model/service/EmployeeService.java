package model.service;

import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    void insertEmployee(Employee employee) throws SQLException;

    List<Employee> selectAllEmployee() throws SQLException;
}
