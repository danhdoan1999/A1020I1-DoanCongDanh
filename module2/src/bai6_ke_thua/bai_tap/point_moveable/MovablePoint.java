package bai6_ke_thua.bai_tap.point_moveable;

public class MovablePoint extends Point {
    public float xSpeed = 0;
    public float ySpeed = 0;
    public MovablePoint(){}
    public MovablePoint(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x,float y , float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + getXSpeed() +
                ", ySpeed=" + getYSpeed() +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
    public MovablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
