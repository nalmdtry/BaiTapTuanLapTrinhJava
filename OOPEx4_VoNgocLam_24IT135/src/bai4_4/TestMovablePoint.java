package bai4_4;

public class TestMovablePoint {
    public static void main(String[] args) {
        // Kiểm thử Point
        Point p = new Point(2.0f, 3.0f);
        System.out.println("Point: " + p);
        
        // Kiểm thử MovablePoint
        MovablePoint mp = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Before move: " + mp);
        
        // Di chuyển điểm
        mp.move();
        System.out.println("After move: " + mp);
    }
}
