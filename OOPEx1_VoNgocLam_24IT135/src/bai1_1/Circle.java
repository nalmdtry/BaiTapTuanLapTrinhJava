package bai1_1;

public class Circle {
    private double radius;
    private String color;

    // Constructor mặc định
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor có tham số radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // Mặc định màu đỏ
    }

    // Constructor có cả radius và color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter cho bán kính
    public double getRadius() {
        return radius;
    }

    // Getter cho diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Getter cho màu
    public String getColor() {
        return color;
    }

    // Setter cho bán kính
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter cho màu sắc
    public void setColor(String color) {
        this.color = color;
    }

    // toString() method để hiển thị thông tin đối tượng
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

