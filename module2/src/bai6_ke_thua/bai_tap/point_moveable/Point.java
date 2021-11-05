package bai6_ke_thua.bai_tap.point_moveable;

public class Point {
    public float x = 0;
    public float y = 0;
    public Point(){}
    public Point(float x , float y){
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
        System.out.println(" x = " + x + " y = " + y);
    }
    public float[] getXY(){
        float[] array = new float[2];
        return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
