package bai7_Abstract_interface.bai_tap.trien_khai_interface_resizeable;

public class MainTestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3,"blue",false);
        shapes[1] = new Rectangle(3,4,"red",true);
        shapes[2] = new Square(5,"yellow",true);
        for (Shape s: shapes) {
            System.out.println(s);
        }
}
}
