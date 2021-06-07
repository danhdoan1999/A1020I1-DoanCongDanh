package model.repository.Customer;

import model.bean.Customer;
import model.repository.BaseRepository;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryIml implements CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call customer_create(?,?,?,?,?,?,?,?)");
        callableStatement.setString(1,customer.getNameCustomer());
        callableStatement.setString(2,customer.getDayOfBirth());
        callableStatement.setString(3,customer.getGender());
        callableStatement.setString(4,customer.getIdCard());
        callableStatement.setString(5,customer.getPhoneNumber());
        callableStatement.setString(6,customer.getEmail());
        callableStatement.setString(7,customer.getTypeOfCustomer());
        callableStatement.setString(8,customer.getAddress());
        callableStatement.executeUpdate();
    }

    @Override
    public List<Customer> selectAllCustomer() throws  SQLException{
        List<Customer> customerList = new ArrayList<>();
            CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call customer_list;");
            ResultSet resultSet = callableStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()){
                customer = new Customer();
                customer.setIdCustomer(resultSet.getInt("id_khach_hang"));
                customer.setNameCustomer(resultSet.getString("ho_ten_kh"));
                customer.setDayOfBirth(resultSet.getString("ngay_sinh_kh"));
                customer.setGender(resultSet.getString("gioi_tinh"));
                customer.setIdCard(resultSet.getString("cmnd_kh"));
                customer.setPhoneNumber(resultSet.getString("so_dth"));
                customer.setEmail(resultSet.getString("email"));
                customer.setTypeOfCustomer(resultSet.getString("ten_loai_khach"));
                customer.setAddress(resultSet.getString("dia_chi"));
                customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDelete = false;
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call customer_delete(?);");
        callableStatement.setInt(1,id);
        rowDelete = callableStatement.executeUpdate() > 0;
        return rowDelete;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        boolean rowUpdate = false;
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call customer_update(?,?,?,?,?,?,?,?,?)");
        callableStatement.setInt(1,customer.getIdCustomer());
        callableStatement.setString(2,customer.getNameCustomer());
        callableStatement.setString(3,customer.getDayOfBirth());
        callableStatement.setString(4,customer.getGender());
        callableStatement.setString(5,customer.getIdCard());
        callableStatement.setString(6,customer.getPhoneNumber());
        callableStatement.setString(7,customer.getEmail());
        callableStatement.setString(8,customer.getTypeOfCustomer());
        callableStatement.setString(9,customer.getAddress());
        rowUpdate = callableStatement.executeUpdate() > 0;
        return rowUpdate;
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        Customer customer = null;
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call get_customer_by_id(?);");
        callableStatement.setInt(1,id);
        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("ho_ten_kh");
            String birthday = resultSet.getString("ngay_sinh_kh");
            String gender = resultSet.getString("gioi_tinh");
            String idCard = resultSet.getString("cmnd_kh");
            String phone = resultSet.getString("so_dth");
            String email = resultSet.getString("email");
            String type = resultSet.getString("ten_loai_khach");
            String address = resultSet.getString("dia_chi");
            customer = new Customer(id,name,birthday,gender,idCard,phone,email,type,address);
        }
        return customer;
    }
}
