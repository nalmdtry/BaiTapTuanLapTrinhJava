package bai4_3;

public class TestPoint {
    public static void main(String[] args) {
        // Kiểm thử Point2D
        Point2D p2d = new Point2D(3.5f, 5.0f);
        System.out.println("Point2D: " + p2d);
        
        // Kiểm thử Point3D
        Point3D p3d = new Point3D(1.2f, 4.5f, 7.8f);
        System.out.println("Point3D: " + p3d);
        
        // Thay đổi tọa độ Point3D
        p3d.setXYZ(9.1f, 8.2f, 3.3f);
        System.out.println("Updated Point3D: " + p3d);
    }
}
