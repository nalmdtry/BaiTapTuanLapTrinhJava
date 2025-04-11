package bai5_2;

public class Cylinder {
    private Circle base; // Thành phần Circle
    private double height;

    // Constructor mặc định
    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    // Constructor có tham số
    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    // Getter và Setter
    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    // Tính diện tích toàn phần của hình trụ
    public double getSurfaceArea() {
        return 2 * Math.PI * getRadius() * height + 2 * base.getArea();
    }

    // Tính thể tích
    public double getVolume() {
        return base.getArea() * height;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}

