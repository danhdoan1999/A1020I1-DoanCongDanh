package bai6_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    public double height;
    public Cylinder(){}
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius , String color ){
        super(radius, color);
        this.height =height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder : " +
                "height = " + getHeight() +
                ", radius = " + getRadius() +
                ", color = " + getColor()+
                "the tich hinh tru la : " + getVolume();
    }
}
