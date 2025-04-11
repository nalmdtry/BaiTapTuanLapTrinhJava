package bai6_2;

public class TestGeometricObject {
 public static void main(String[] args) {
     GeometricObject circle = new Circle(5.0);
     System.out.println(circle);
     System.out.println("Area: " + circle.getArea());
     System.out.println("Perimeter: " + circle.getPerimeter());

     System.out.println();

     GeometricObject rectangle = new Rectangle(4.0, 7.0);
     System.out.println(rectangle);
     System.out.println("Area: " + rectangle.getArea());
     System.out.println("Perimeter: " + rectangle.getPerimeter());
 }
}

