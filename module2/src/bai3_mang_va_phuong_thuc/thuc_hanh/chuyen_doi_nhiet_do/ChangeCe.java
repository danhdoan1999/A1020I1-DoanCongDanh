package bai3_mang_va_phuong_thuc.thuc_hanh.chuyen_doi_nhiet_do;

import java.util.Scanner;

public class ChangeCe {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        while (true) {
            System.out.println("Menu\n" +
                    "\n" +
                    "1. Fahrenheit to Celsius\n" +
                    "\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "\n" +
                    "0. Exit ");
            Scanner input = new Scanner(System.in);
            int section = input.nextInt();
            switch (section) {
                case 1:
                    System.out.println("Please Enter the Fahrenheit ! ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Result " + fChangeToC(fahrenheit));
                    break;
                case 2:
                    System.out.println("Please Enter the Celsius ! ");
                    celsius = input.nextDouble();
                    System.out.println("Result " + cChangeToF(celsius));
                    break;
                default:
                    break;
            }
        }
    }
    public static double fChangeToC(double fahrenheit){
        double ketqua = (5.0 / 9) * (fahrenheit - 32);
        return ketqua;

    }
    public static double cChangeToF(double celsius){
        double ketqua = (9.0 / 5) * celsius + 32;
        return ketqua;
    }
}
