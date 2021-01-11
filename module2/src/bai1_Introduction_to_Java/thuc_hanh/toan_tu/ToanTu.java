package bai1_Introduction_to_Java.thuc_hanh.toan_tu;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong : ");
        width = scanner.nextFloat();
        System.out.println("Nhap chieu dai: ");
        height = scanner.nextFloat();
        float s = width*height;
        System.out.println("dien tich la :" + s);
    }
}
