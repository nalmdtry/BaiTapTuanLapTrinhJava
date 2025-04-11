package bai4_1;

public class Cylinder extends Circle {
    private double height;

    // Constructor mặc định
    public Cylinder() {
        super();  // Gọi constructor của Circle
        this.height = 1.0;
    }

    // Constructor với chiều cao
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor với bán kính và chiều cao
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor với bán kính, chiều cao và màu sắc
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ
    public double getVolume() {
        return super.getArea() * height; // Dùng getArea() từ Circle
    }

    // Ghi đè getArea() để tính diện tích xung quanh hình trụ
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Ghi đè toString() để mô tả Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}

