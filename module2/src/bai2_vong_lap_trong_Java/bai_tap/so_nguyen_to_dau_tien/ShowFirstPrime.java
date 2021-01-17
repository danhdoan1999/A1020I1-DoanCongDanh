package bai2_vong_lap_trong_Java.bai_tap.so_nguyen_to_dau_tien;

import java.util.Scanner;

public class ShowFirstPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to can in ra ");
        int number = input.nextInt();
        int count = 0;
        int n = 1;
        while (number > count){
            int dem = 0;
            for (int i = 1 ;i <= n ; i++){
                if(n%i==0){
                    dem++;
                }
            }
            if(dem == 2){
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
