package bai6_ke_thua.bai_tap.point2d_point3d;

public class MainPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4.0f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(3.0f,5.0f,2.2f);
        System.out.println(point3D);
        point2D.setXY(5,6);
        point3D.setXYZ(1,2,3);
    }
}
