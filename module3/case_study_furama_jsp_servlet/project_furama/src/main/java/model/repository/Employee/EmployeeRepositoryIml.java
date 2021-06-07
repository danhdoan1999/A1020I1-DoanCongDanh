package model.repository.Employee;

import model.bean.Customer;
import model.bean.Employee;
import model.repository.BaseRepository;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryIml implements EmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> selectAllEmployee() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call employee_list();");
        ResultSet resultSet = callableStatement.executeQuery();
        Employee employee = null;
        while (resultSet.next()){
            employee = new Employee();
            employee.setId(resultSet.getInt("id_nhan_vien"));
            employee.setName(resultSet.getString("ten"));
            employee.setBirthday(resultSet.getString("ngay_sinh"));
            employee.setIdCard(resultSet.getString("cmnd"));
            employee.setSalary(resultSet.getString("luong"));
            employee.setPhone(resultSet.getString("sdt"));
            employee.setEmail(resultSet.getString("email"));
            employee.setAddress(resultSet.getString("dia_chi"));
            employee.setPosition(resultSet.getString("ten_vi_tri"));
            employee.setEducationDegree(resultSet.getString("trinh_do"));
            employee.setDivision(resultSet.getString("bo_phan"));
            employee.setUsername(resultSet.getString("ten_tai_khoan"));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call employee_create(?,?,?,?,?,?,?,?,?,?,?)");
        callableStatement.setString(1,employee.getName());
        callableStatement.setString(2,employee.getBirthday());
        callableStatement.setString(3,employee.getIdCard());
        callableStatement.setString(4,employee.getSalary());
        callableStatement.setString(5,employee.getPhone());
        callableStatement.setString(6,employee.getEmail());
        callableStatement.setString(7,employee.getAddress());
        callableStatement.setString(8,employee.getPosition());
        callableStatement.setString(9,employee.getEducationDegree());
        callableStatement.setString(10,employee.getDivision());
        callableStatement.setString(11,employee.getUsername());
        callableStatement.executeUpdate();
    }
}
