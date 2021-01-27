package bai6_ke_thua.thuc_hanh;

public class Rectangle extends Shape {
    public double width;
    public double length;
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length , String color , boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" +
                getWidth() +
                "and length=" + getLength() +
                ", which is a subclass of" + super.toString();
    }
}
