package bai2_8;

public class MyCircle {
    private MyPoint center; // Tâm của hình tròn
    private int radius;     // Bán kính của hình tròn

    // Constructor mặc định: tâm (0,0) và bán kính 1
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Constructor với tọa độ (x, y) và bán kính
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor với một MyPoint làm tâm và bán kính
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getter cho center
    public MyPoint getCenter() {
        return center;
    }

    // Setter cho center
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // Getter cho radius
    public int getRadius() {
        return radius;
    }

    // Setter cho radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter cho tọa độ X của center
    public int getCenterX() {
        return center.getX();
    }

    // Setter cho tọa độ X của center
    public void setCenterX(int x) {
        center.setX(x);
    }

    // Getter cho tọa độ Y của center
    public int getCenterY() {
        return center.getY();
    }

    // Setter cho tọa độ Y của center
    public void setCenterY(int y) {
        center.setY(y);
    }

    // Setter cho tọa độ (x, y) của center
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi hình tròn
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Tính khoảng cách giữa hai tâm của hai hình tròn
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }
}

