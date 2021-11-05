package bai2_vong_lap_trong_Java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class ShowGeometry {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu : \n" + "1 . Print the rectangle \n" + "2. Print the square triangle \n" + "3. Print isosceles triangle \n" + "4. Exit");
        while (true) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1 ; i < 5;i++ ){
                        for(int j = 1 ; j<5;j++){
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 1 ; i<= 5 ; i++){
                        for(int j = 1; j <= i ; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 5 ; i >= 1 ; i--){
                        for(int j = 1; j <= i ; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    break;
            }
        }
    }
}
