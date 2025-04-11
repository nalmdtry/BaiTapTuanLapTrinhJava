package bai4_5;

public class Circle extends Shape {
    private double radius;

    // Constructor không tham số
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor có tham số radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor đầy đủ
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}

