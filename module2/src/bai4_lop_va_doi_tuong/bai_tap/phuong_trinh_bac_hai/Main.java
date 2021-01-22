package bai4_lop_va_doi_tuong.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = scanner.nextDouble();
        System.out.print("Enter b:");
        double b = scanner.nextDouble();
        System.out.print("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant() >= 0){
            if(quadraticEquation.getDiscriminant() == 0){
                System.out.println("Phuong trinh co nghiem kep x1,x2 = " + quadraticEquation.getRoot1());
            }else {
                System.out.println("Phuong trinh co nghiem x1 = " + quadraticEquation.getRoot1() + "x2 = " + quadraticEquation.getRoot2());
            }
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
