package bai15_exception_debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.Scanner;
class IllegalTriangleException extends Exception{
        IllegalTriangleException(){
            super("Loi !!! ");
        }
}
public class Triangle {
    public static boolean triangle(int a , int b , int c) throws IllegalTriangleException{
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalTriangleException();
        }
        return true;
    }
    public static boolean checkNum(int a, int b, int c) throws IllegalTriangleException{
        if (a + b < c || a + c < b || b + c < a){
            throw new IllegalTriangleException();
        }
        return true;
    }
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao canh a ");
        int a = input.nextInt();
        System.out.println("Nhap vao canh b ");
        int b = input.nextInt();
        System.out.println("Nhap vao canh c ");
        int c = input.nextInt();
        try{
            if (triangle(a,b,c) && checkNum(a,b,c)){
                System.out.println("Tam giac co 3 canh a = "+ a + ", b = " + b + ", c = " + c);
            }
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
