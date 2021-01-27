package bai6_ke_thua.bai_tap.point2d_point3d;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public  Point2D(){}
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        System.out.println("x = " + x + "y = " + y);
    }
    public float[] getXY(){
        float[] array = new float[2];
        return array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
