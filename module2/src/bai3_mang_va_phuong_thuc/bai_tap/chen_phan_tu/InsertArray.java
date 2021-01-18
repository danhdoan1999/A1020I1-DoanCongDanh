package bai3_mang_va_phuong_thuc.bai_tap.chen_phan_tu;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        int[] array = {2,6,4,7,9,5,0};
        Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao so muon chen : ");
            int num = input.nextInt();
            System.out.println("Nhap vao vi tri muon chen : ");
            int index = input.nextInt();
            if(index <= 0 || index >= array.length) {
                System.out.println("Khong chen dc phan tu vao mang");
            }else{
                for (int i = array.length-1; i > index;i--){
                    array[i] = array[i-1];
                }
                array[index] = num;
                System.out.println(Arrays.toString(array));
            }
    }
}
