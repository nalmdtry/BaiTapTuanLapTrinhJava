package bai1_2;

public class Circle2 {
 private double radius;

 // Constructors
 public Circle2() {
     this.radius = 1.0;  // Default radius
 }

 public Circle2(double radius) {
     this.radius = radius;
 }

 // Getter and Setter
 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 // Methods to calculate area and circumference
 public double getArea() {
     return Math.PI * radius * radius;
 }

 public double getCircumference() {
     return 2 * Math.PI * radius;
 }

 // toString() method
 @Override
 public String toString() {
     return "Circle[radius=" + radius + "]";
 }
}

