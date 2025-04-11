package bai5_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1); // Output: Point(10, 20)

        // Thay đổi tọa độ
        p1.setXY(100, 10);
        System.out.println("After setXY: " + p1); // Output: Point(100, 10)
    }
}

