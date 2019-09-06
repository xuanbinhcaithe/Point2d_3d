package OOP.Point2D_3D;

public class Point2dTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(5.2f,3.4f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.5f,4.3f,5.6f);
        System.out.println(point3D);

    }
}
