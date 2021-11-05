package bai3_mang_va_phuong_thuc.bai_tap.tong_cot;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = {
                {1,2,3,4},
                {9,5,6,2},
                {1,2,3,9}};
        System.out.println("nhap vao vi tri cot muon cong : ");
        int position = input.nextInt(array[0].length+1);
        int sum = 0;
        for (int i = 0 ; i < position ;i++){
             sum = 0;
            for (int j = 0;j<array.length;j++){
                sum += array[j][i];
            }
        }
        System.out.println(sum);

    }
}
