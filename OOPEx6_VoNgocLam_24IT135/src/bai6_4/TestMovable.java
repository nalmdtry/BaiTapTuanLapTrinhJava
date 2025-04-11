package bai6_4;

public class TestMovable {
 public static void main(String[] args) {
     // Kiểm thử MovablePoint
     MovablePoint point = new MovablePoint(0, 0, 2, 3);
     System.out.println(point);

     point.moveUp();
     System.out.println("After moveUp: " + point);

     point.moveRight();
     System.out.println("After moveRight: " + point);

     // Kiểm thử MovableCircle
     MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
     System.out.println(circle);

     circle.moveUp();
     circle.moveLeft();
     System.out.println("After moveUp and moveLeft: " + circle);
 }
}
