package bai7_2;

import java.util.*;

public class TestPolyLine {
    public static void main(String[] args) {
        // Kiểm thử constructor mặc định và toString()
        PolyLine l1 = new PolyLine();
        System.out.println(l1); // {}

        // Kiểm thử appendPoint()
        l1.appendPoint(new Point(1, 2));
        l1.appendPoint(3, 4);
        l1.appendPoint(5, 6);
        System.out.println(l1); // {(1,2)(3,4)(5,6)}
        System.out.println("Chiều dài polyline l1: " + l1.getLength());

        // Kiểm thử constructor với danh sách điểm
        List<Point> points = new ArrayList<>();
        points.add(new Point(11, 12));
        points.add(new Point(13, 14));
        PolyLine l2 = new PolyLine(points);
        System.out.println(l2); // {(11,12)(13,14)}
        System.out.println("Chiều dài polyline l2: " + l2.getLength());
    }
}

