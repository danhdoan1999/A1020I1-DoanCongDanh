package case_study.furama_resort.models;

public class Customer extends Services {
    public String hoTen;
    public String dateBirth;
    public String gender;
    public double idCustomer;
    public double phone;
    public String email;
    public String member;
    public String address;

    public  Customer(){}
    public Customer(String hoTen, String dateBirth, String gender, double idCustomer, double phone, String email, String member, String address) {
        this.hoTen = hoTen;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.idCustomer = idCustomer;
        this.phone = phone;
        this.email = email;
        this.member = member;
        this.address = address;
    }

    public Customer(String id, String nameService, int acreage, double cost, int quantity, String dayRents, String hoTen, String dateBirth, String gender, double idCustomer, double phone, String email, String member, String address) {
        super(id, nameService, acreage, cost, quantity, dayRents);
        this.hoTen = hoTen;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.idCustomer = idCustomer;
        this.phone = phone;
        this.email = email;
        this.member = member;
        this.address = address;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(double idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void showInfor() {

    }
}
