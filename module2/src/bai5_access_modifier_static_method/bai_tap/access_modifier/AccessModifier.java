package bai5_access_modifier_static_method.bai_tap.access_modifier;

public class AccessModifier {
    private double radius;
    private String color;
    public AccessModifier(){
        this.radius = 10;
        this.color = "red";
    }
    public  AccessModifier(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
}
