package bai6_ke_thua.bai_tap.class_triangle;

import bai6_ke_thua.thuc_hanh.Shape;

public class MainTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape("blue",true);
        System.out.println(shape);
        Triangle triangle = new Triangle(2,4,5,"red",false);
        System.out.println(triangle);
    }

}
