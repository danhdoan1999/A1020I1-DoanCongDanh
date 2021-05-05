public class Customer {
    private String nameCustomer;
    private String dateBirth;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(String nameCustomer, String dateBirth, String address, String image) {
        this.nameCustomer = nameCustomer;
        this.dateBirth = dateBirth;
        this.address = address;
        this.image = image;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
