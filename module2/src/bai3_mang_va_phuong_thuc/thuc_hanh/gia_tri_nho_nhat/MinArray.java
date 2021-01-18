package bai3_mang_va_phuong_thuc.thuc_hanh.gia_tri_nho_nhat;

public class MinArray {
    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 1 ; i<array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 2, 6, 9};
        System.out.println("The smallest element in the array is: " + minValue(arr));
    }
}
