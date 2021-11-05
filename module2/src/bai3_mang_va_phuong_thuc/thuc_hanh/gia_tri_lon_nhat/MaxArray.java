package bai3_mang_va_phuong_thuc.thuc_hanh.gia_tri_lon_nhat;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao so phan tu trong mang ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("mang ko dc qua 20 phan tu");
            }
        }while (size>20);
        array = new int[size];
        for(int i = 0;i<array.length;i++){
            System.out.println("Nhap vao phan tu thu "+ (i+1));
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for(int i = 1 ; i<array.length;i++ ){
            if(array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("gia tri lon nhat trong mang la " + max + "tai vi tri "+ index);
    }
}
