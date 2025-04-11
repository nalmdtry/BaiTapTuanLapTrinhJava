package bai1_3;

public class Rectangle {
    private float length;
    private float width;

    // Constructor mặc định
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // Constructor có tham số
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter cho length
    public float getLength() {
        return length;
    }

    // Setter cho length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter cho width
    public float getWidth() {
        return width;
    }

    // Setter cho width
    public void setWidth(float width) {
        this.width = width;
    }

    // Phương thức tính diện tích
    public float getArea() {
        return length * width;
    }

    // Phương thức tính chu vi
    public float getPerimeter() {
        return 2 * (length + width);
    }

    // toString() để hiển thị thông tin
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
