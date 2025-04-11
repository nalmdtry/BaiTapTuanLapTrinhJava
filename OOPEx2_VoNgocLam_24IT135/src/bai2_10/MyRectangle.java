package bai2_10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor sử dụng tọa độ x, y
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor sử dụng MyPoint
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters và Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Lấy chiều rộng
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Lấy chiều cao
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Tính chu vi
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Tính diện tích
    public int getArea() {
        return getWidth() * getHeight();
    }

    // toString() để mô tả hình chữ nhật
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

