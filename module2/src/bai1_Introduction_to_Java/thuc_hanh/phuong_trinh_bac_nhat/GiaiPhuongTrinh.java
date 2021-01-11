package bai1_Introduction_to_Java.thuc_hanh.phuong_trinh_bac_nhat;

import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a = scanner.nextFloat();
        System.out.println("Nhap b : ");
        b = scanner.nextFloat();
        System.out.println("Nhap c : ");
        c = scanner.nextFloat();
        if (a != 0) {
            float answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
