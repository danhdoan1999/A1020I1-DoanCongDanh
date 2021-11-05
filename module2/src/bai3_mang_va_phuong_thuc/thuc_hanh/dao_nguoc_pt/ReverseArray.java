package bai3_mang_va_phuong_thuc.thuc_hanh.dao_nguoc_pt;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("mang sau khi dao nguoc la : "+ Arrays.toString(array));
    }
}
