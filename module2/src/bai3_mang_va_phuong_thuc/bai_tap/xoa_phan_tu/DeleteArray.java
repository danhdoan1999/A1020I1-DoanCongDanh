package bai3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] array = {3,4,2,3,5,6,3};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao phan tu muon xoa");
        int num = input.nextInt();
        int index = -1;
       for (int i = 0 ; i < array.length-1;i++){
           if (num == array[i]){
               index = i;
           }
       }
       if (index != -1){
           for (int i = array.length-1; i > index; i--) {
               array[i] = array[i-1];
           }
       }
        System.out.println("mang sau khi xoa la " + Arrays.toString(array));
    }
}
