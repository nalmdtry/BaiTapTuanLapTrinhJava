package bai6_8;

public class TestMovable {
 public static void main(String[] args) {
     // Upcasting MovablePoint lên Movable
     Movable m1 = new MovablePoint(5, 6, 10, 15);
     System.out.println(m1); // MovablePoint{x=5, y=6, xSpeed=10, ySpeed=15}
     m1.moveLeft();
     System.out.println(m1); // x giảm 10 đơn vị

     // Upcasting MovableCircle lên Movable
     Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
     System.out.println(m2); // MovableCircle{center=MovablePoint{x=1, y=2, xSpeed=3, ySpeed=4}, radius=20}
     m2.moveRight();
     System.out.println(m2); // x tăng 3 đơn vị

     // Kiểm thử MovableRectangle
     Movable m3 = new MovableRectangle(0, 0, 10, 10, 2, 2);
     System.out.println(m3);
     m3.moveDown();
     System.out.println(m3);
 }
}

