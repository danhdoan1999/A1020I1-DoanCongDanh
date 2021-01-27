package bai6_ke_thua.bai_tap.circle_cylinder;

public class Circle {
    public double radius;
    public String color;
    public Circle(){
    }
    public Circle(double radius , String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle : " +
                "radius = " + getColor() +
                ", color = " + getRadius()+
                "dien tich hinh tron la :" + getArea();
    }
}
