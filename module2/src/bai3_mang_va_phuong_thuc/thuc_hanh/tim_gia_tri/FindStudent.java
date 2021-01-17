package bai3_mang_va_phuong_thuc.thuc_hanh.tim_gia_tri;

import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        String[] student = {"Danh","Cuong","Hieu","Dat"};
        Scanner input = new Scanner(System.in);
        System.out.println("xin ban nhap vao ten muon tim kiem ");
        String name = input.nextLine();
        boolean notFound = false;
        for (int i = 0 ; i < student.length;i++){
            if(student[i].equals(name)){
                System.out.println("Sinh vien "+ name + " nam o vi tri thu " + (i+1) + " trong mang ");
                notFound = true;
                break;
            }
        }
        if(!notFound){
            System.out.println( name + " khong co trong mang");
        }
    }
}
