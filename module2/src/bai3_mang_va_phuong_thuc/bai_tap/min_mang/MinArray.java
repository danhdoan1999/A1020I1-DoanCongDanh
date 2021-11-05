package bai3_mang_va_phuong_thuc.bai_tap.min_mang;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[] array;
        int n;
        System.out.println("Nhap vao so phan tu trong mang : ");
        n = input.nextInt();
        array = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Nhap vao phan tu thu " + (i+1));
            array[i] = input.nextInt();
        }
        System.out.println("Mang vua nhap la " + Arrays.toString(array));
        System.out.println("Phan tu nho nhat trong mang la : " + min(array));
    }
}
