package bai6_8;

//MovablePoint.java
public class MovablePoint implements Movable {
 int x, y, xSpeed, ySpeed;  // Package access

 // Constructor
 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 @Override
 public void moveUp() {
     y -= ySpeed;   // Trục tọa độ hướng xuống
 }

 @Override
 public void moveDown() {
     y += ySpeed;
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
     return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
 }
}

