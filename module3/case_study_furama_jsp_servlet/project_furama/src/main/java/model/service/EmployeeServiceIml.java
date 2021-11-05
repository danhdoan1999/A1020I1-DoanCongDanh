package model.service;

import model.bean.Employee;
import model.repository.Employee.EmployeeRepository;
import model.repository.Employee.EmployeeRepositoryIml;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceIml implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryIml();

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        employeeRepository.insertEmployee(employee);
    }

    @Override
    public List<Employee> selectAllEmployee() throws SQLException {
        return employeeRepository.selectAllEmployee();
    }
}
