package case_study.furama_resort.models;

public class Employee {
    public String id;
    public String nameOfEmployee ;
    public String ageEmployee;
    public String addressEmployee;

    public Employee(String id, String nameOfEmployee, String ageEmployee, String addressEmployee) {
        this.id = id;
        this.nameOfEmployee = nameOfEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public Employee() {}

    @Override
    public String toString() {
        return "\n\tid Employee : " + getId() +
                "\n\tName of Employee: " + getNameOfEmployee() +
                "\n\tDate of birth: " + getAgeEmployee() +
                "\n\tAddress: " + getAddressEmployee();
    }
}
