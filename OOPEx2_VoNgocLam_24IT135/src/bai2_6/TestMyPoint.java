package bai2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        // Khởi tạo một điểm mặc định
        MyPoint p1 = new MyPoint();
        System.out.println(p1); // In ra "(0, 0)"

        // Kiểm tra setter và getter
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        // Kiểm tra setXY() và getXY()
        p1.setXY(3, 0);
        System.out.println("getXY() result: " + p1.getXY()[0] + ", " + p1.getXY()[1]);
        System.out.println(p1);

        // Tạo một điểm khác bằng constructor
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        // Kiểm tra các phương thức distance()
        System.out.println("Distance p1 to p2: " + p1.distance(p2)); // version dùng MyPoint
        System.out.println("Distance p2 to p1: " + p2.distance(p1)); // version dùng MyPoint
        System.out.println("Distance p1 to (5,6): " + p1.distance(5, 6)); // version dùng (x,y)
        System.out.println("Distance p1 to origin: " + p1.distance()); // version mặc định đến (0,0)

        // Khởi tạo mảng 10 điểm có tọa độ (1,1), (2,2), ..., (10,10)
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Duyệt và in tất cả các điểm trong mảng
        for (MyPoint point : points) {
            System.out.println(point);
        }
    }
}

