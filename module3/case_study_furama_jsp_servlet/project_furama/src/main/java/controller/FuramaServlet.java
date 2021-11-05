package controller;

import common.Validate;
import model.bean.Customer;
import model.bean.Employee;
import model.service.CustomerService;
import model.service.CustomerServiceIml;
import model.service.EmployeeService;
import model.service.EmployeeServiceIml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FuramaServlet", urlPatterns = {"","/furama"})
public class FuramaServlet extends HttpServlet {
    private CustomerService customerService;
    private EmployeeService employeeService;

    public  void init(){
        customerService = new CustomerServiceIml();
        employeeService = new EmployeeServiceIml();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
            switch (action){
                case "create-customer":
                    try {
                        addNewCustomer(request,response);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case "create-employee":
                    try {
                        addNewEmployee(request,response);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case"edit-customer":
                    try {
                        updateCustomer(request,response);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                default:
                    try {
                        listCustomer(request,response);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
            }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if(action == null){
        action = "";
    }
    switch (action){
        case "create-customer":
            addNewCustomerForm(request,response);
            break;
        case "create-employee":
            addNewEmployeeForm(request,response);
            break;
        case "delete-customer":
            try {
                deleteCustomer(request,response);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            break;
        case "edit-customer":
            try {
                editCustomerForm(request,response);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        case "list-employee":
            try {
                listEmployee(request,response);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            break;
        case"list-customer":
            try {
                listCustomer(request,response);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            break;
        default:
            getIndexPage(request,response);
            break;
    }
    }

    private void getIndexPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("layout/index.jsp");
    }


    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Customer> customerList = this.customerService.selectAllCustomer();
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("pages/customer/home.jsp").forward(request,response);
    }
    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Employee> employeeList = this.employeeService.selectAllEmployee();
        request.setAttribute("employeeList",employeeList);
        request.getRequestDispatcher("pages/employee/list-employee.jsp").forward(request,response);
    }
    private void addNewCustomerForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("pages/customer/create.jsp");
    }
    private void addNewEmployeeForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("pages/employee/create-employee.jsp");
    }
    private void addNewCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter("inputName");
        String messageName = Validate.validateCustomerName(name);
        String birthday = request.getParameter("inputBirthday");
        String gender = request.getParameter("inputGender");
        String idCard = request.getParameter("inputIdCard");
        String phone = request.getParameter("inputPhone");
        String email = request.getParameter("inputEmail");
        String type = request.getParameter("inputTypeCustomer");
        String address = request.getParameter("inputAddress");

        Customer newCustomer = new Customer(name,birthday,gender,idCard,phone,email,type,address);
        // validate thành công

            if (messageName == null){
                customerService.insertCustomer(newCustomer);
                request.setAttribute("message","Add new customer success !!! ");

            }else {
                // validate thất bại
                // customerService.insertCustomer(newCustomer);
                request.setAttribute("messageName", messageName);
            }
        request.getRequestDispatcher("pages/customer/create.jsp").forward(request, response);
    }
    private void addNewEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter("inputName");
        String birthday = request.getParameter("inputBirthday");
        String idCard = request.getParameter("inputIdCard");
        String salary = request.getParameter("inputSalary");
        String phone = request.getParameter("inputPhone");
        String email = request.getParameter("inputEmail");
        String address = request.getParameter("inputAddress");
        String position = request.getParameter("inputPosition");
        String education = request.getParameter("inputEducation");
        String division = request.getParameter("inputDivision");
        String username = request.getParameter("inputUsername");

        Employee newEmployee = new Employee(name,birthday,idCard,salary,phone,email,address,position,education,division,username);
        this.employeeService.insertEmployee(newEmployee);
        request.setAttribute("message","Add new employee success !!! ");
        request.getRequestDispatcher("pages/employee/create-employee.jsp").forward(request,response);
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.deleteCustomer(id);
        List<Customer> customerList = customerService.selectAllCustomer();
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("pages/customer/home.jsp").forward(request,response);
    }
    private void editCustomerForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer editCustomer = customerService.getCustomerById(id);
        request.setAttribute("customer",editCustomer);
        request.getRequestDispatcher("pages/customer/edit.jsp").forward(request,response);
    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("inputName");
        String birthday = request.getParameter("inputBirthday");
        String gender = request.getParameter("inputGender");
        String idCard = request.getParameter("inputIdCard");
        String phone = request.getParameter("inputPhone");
        String email = request.getParameter("inputEmail");
        String type = request.getParameter("inputTypeCustomer");
        String address = request.getParameter("inputAddress");
        Customer customer = new Customer(id,name,birthday,gender,idCard,phone,email,type,address);
        customerService.updateCustomer(customer);
        request.setAttribute("message","Update Customer Completed !!!");
        request.getRequestDispatcher("pages/customer/edit.jsp").forward(request,response);
    }

}
