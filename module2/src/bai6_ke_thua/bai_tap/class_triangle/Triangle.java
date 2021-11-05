package bai6_ke_thua.bai_tap.class_triangle;

import bai6_ke_thua.thuc_hanh.Shape;

public class Triangle extends Shape {
    public double side1 = 0;
    public double side2 = 0;
    public double side3 = 0;
    public Triangle(){}
    public Triangle(double side1,double side2,double side3,String color , boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt((p-side1)*(p-side2)*(p-side3)*p);
    }
    public  double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle : " +
                "\n side1=" + getSide1() +
                "\n, side2=" + getSide2() +
                "\n, side3=" + getSide3() +
                "\n, color='" + getColor() + '\'' +
                "\n, filled=" + (isFilled()? "filled" : "not filled") +
                "\nChu vi tam giac la : "+ getPerimeter() + "\n Dien tich tam giac la : "+getArea();
    }
}
