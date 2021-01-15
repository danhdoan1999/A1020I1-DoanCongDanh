package bai1_Introduction_to_Java.bai_tap.tien_te;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tien : ");
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        double vng = money*23000;
        System.out.println(money + " dola se bang "+ vng + " viet nam dong");
    }
}
