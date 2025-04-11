package bai4_5;

public class TestShape {
    public static void main(String[] args) {
        // Kiểm thử Shape
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        // Kiểm thử Circle
        Circle circle = new Circle(3.0, "blue", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Kiểm thử Rectangle
        Rectangle rectangle = new Rectangle(2.0, 5.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Kiểm thử Square
        Square square = new Square(4.0, "pink", false);
        System.out.println(square);
        square.setSide(5.0);
        System.out.println("After setting side to 5.0: " + square);
    }
}

