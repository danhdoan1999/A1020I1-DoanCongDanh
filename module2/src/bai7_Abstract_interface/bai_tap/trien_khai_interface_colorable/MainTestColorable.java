package bai7_Abstract_interface.bai_tap.trien_khai_interface_colorable;


import bai7_Abstract_interface.bai_tap.trien_khai_interface_resizeable.Circle;
import bai7_Abstract_interface.bai_tap.trien_khai_interface_resizeable.Rectangle;
import bai7_Abstract_interface.bai_tap.trien_khai_interface_resizeable.Shape;
import bai7_Abstract_interface.bai_tap.trien_khai_interface_resizeable.Square;

public class MainTestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3,"blue",false);
        shapes[1] = new Rectangle(3,4,"red",true);
        shapes[2] = new Square(5,"yellow",true);
        for (Shape s: shapes) {
            if (s instanceof Square){
                System.out.println("Dien tich hinh vuong la : " + (((Square)s).getArea()));
                Colorable colorable = (Colorable) s;
                colorable.howToColor();
            }else if(s instanceof Circle){
                System.out.println("Dien tich hinh tron la : " + (((Circle)s).getArea()));
            }else if(s instanceof Rectangle){
                System.out.println("Dien tich hinh chu nhat la : " + (((Rectangle)s).getArea()));
            }
        }
    }
}
