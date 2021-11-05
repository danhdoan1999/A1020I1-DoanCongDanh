package bai2_vong_lap_trong_Java.thuc_hanh.check_prime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Xin ban nhap vao so muon kiem tra : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        for(int i = 1; i<=number ;i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(number + " la so nguyen to ");
        }else{
            System.out.println(number+ " ko phai la so nguyen to ");
        }
    }
}
