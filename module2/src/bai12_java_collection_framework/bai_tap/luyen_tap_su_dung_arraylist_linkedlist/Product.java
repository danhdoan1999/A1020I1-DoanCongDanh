package bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

public class Product {
    private int id;
    private String tenSP;
    private double giaSP;

    public Product(int id, String tenSP, double giaSP) {
        this.id = id;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
}
