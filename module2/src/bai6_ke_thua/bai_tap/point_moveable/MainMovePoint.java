package bai6_ke_thua.bai_tap.point_moveable;

public class MainMovePoint {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(4,5,6,7);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
