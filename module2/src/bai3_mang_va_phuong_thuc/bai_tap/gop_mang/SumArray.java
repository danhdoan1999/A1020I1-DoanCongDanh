package bai3_mang_va_phuong_thuc.bai_tap.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cho mang 1 : ");
        int n = input.nextInt();
        int[] array1 = new int[n];
        for (int i = 0 ; i < array1.length;i++){
            System.out.println("Nhap phan tu thu " + (i+1) + " cho mang 1");
            array1[i] = input.nextInt();
        }
        System.out.println("Nhap so luong phan tu cho mang 2 : ");
        int m = input.nextInt();
        int[] array2 = new int[m];
        for (int i = 0 ; i < array2.length;i++){
            System.out.println("Nhap phan tu thu " + (i+1) + " cho mang 1");
            array2[i] = input.nextInt();
        }
        int[] array3 = new int[n+m];
        for (int i = 0 ; i < array1.length;i++){
            array3[i] = array1[i];
        }
        for (int i = array3.length-m;i<array3.length;i++){
            array3[i] = array2[i-n];
        }
        System.out.println("Gop 2 mang thanh "+ Arrays.toString(array3));
    }
}
