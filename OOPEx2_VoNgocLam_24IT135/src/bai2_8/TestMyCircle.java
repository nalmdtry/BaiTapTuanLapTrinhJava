package bai2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        // Tạo một hình tròn mặc định
        MyCircle c1 = new MyCircle();
        System.out.println("Default circle: " + c1);

        // Tạo một hình tròn với tâm (3,4) và bán kính 5
        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println("Circle with center (3,4) and radius 5: " + c2);

        // Tạo một hình tròn với MyPoint làm tâm
        MyPoint p = new MyPoint(6, 8);
        MyCircle c3 = new MyCircle(p, 10);
        System.out.println("Circle with MyPoint as center: " + c3);

        // Kiểm tra các phương thức getter và setter
        c1.setRadius(7);
        c1.setCenterXY(2, 2);
        System.out.println("Updated circle c1: " + c1);
        System.out.println("c1 Center X: " + c1.getCenterX());
        System.out.println("c1 Center Y: " + c1.getCenterY());
        System.out.println("c1 Radius: " + c1.getRadius());

        // Tính diện tích và chu vi
        System.out.println("c1 Area: " + c1.getArea());
        System.out.println("c1 Circumference: " + c1.getCircumference());

        // Tính khoảng cách giữa tâm của c1 và c2
        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}
