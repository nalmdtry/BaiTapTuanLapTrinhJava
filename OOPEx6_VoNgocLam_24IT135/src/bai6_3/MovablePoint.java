package bai6_3;

public class MovablePoint implements Movable {
 private int x, y;        // Tọa độ điểm
 private int xSpeed, ySpeed;  // Tốc độ di chuyển

 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 @Override
 public void moveUp() {
     y += ySpeed;
 }

 @Override
 public void moveDown() {
     y -= ySpeed;
 }

 @Override
 public void moveLeft() {
     x -= xSpeed;
 }

 @Override
 public void moveRight() {
     x += xSpeed;
 }

 @Override
 public String toString() {
     return "MovablePoint(x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ")";
 }
}

