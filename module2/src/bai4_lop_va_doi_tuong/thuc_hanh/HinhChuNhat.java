package bai4_lop_va_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;
    public HinhChuNhat(){}
    public HinhChuNhat(double chieuDai , double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
    public String hienThi(){
        return "Rectangle{" + "dai=" + chieuDai + ", rong=" + chieuRong + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double chieuDai = scanner.nextDouble();
        System.out.print("Enter the height:");
        double chieuRong = scanner.nextDouble();
        HinhChuNhat rectangle = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println("Your Rectangle \n"+rectangle.hienThi());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.tinhChuVi());
        System.out.println("Area of the Rectangle: "+ rectangle.tinhDienTich());
    }
}
