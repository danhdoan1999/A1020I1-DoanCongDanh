package bai12_java_collection_framework.thuc_hanh.phan_biet_hashmap_hashset;

public class Student {
    private String ten;
    private int tuoi;
    private String diachi;

    public Student(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "" +
                "ten :'" + ten + '\'' +
                ", tuoi :" + tuoi +
                ", diachi : '" + diachi + '\'';
    }
}
