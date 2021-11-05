package model.repository.Employee;

import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {

    List<Employee> selectAllEmployee() throws SQLException;

    void insertEmployee(Employee employee)throws SQLException;

}
