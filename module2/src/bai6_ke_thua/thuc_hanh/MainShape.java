package bai6_ke_thua.thuc_hanh;

public class MainShape {
    public static void main(String[] args) {
        /*Shape shape = new Shape("red", false);
        System.out.println(shape);
        shape = new Shape();
        System.out.println(shape);*//*
        Circle circle = new Circle(3.5,"blue",false);
        System.out.println(circle);*/
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
