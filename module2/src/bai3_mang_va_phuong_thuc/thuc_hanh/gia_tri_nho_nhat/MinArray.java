package bai3_mang_va_phuong_thuc.thuc_hanh.gia_tri_nho_nhat;

public class MinArray {
    public static int minValue(int[] array){
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
