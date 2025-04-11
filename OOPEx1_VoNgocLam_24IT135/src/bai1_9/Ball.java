package bai1_9;

public class Ball {
    private float x, y; // Tọa độ
    private int radius; // Bán kính
    private float xDelta, yDelta; // Độ thay đổi tọa độ

    // Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getter và Setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Di chuyển bóng
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Phản xạ theo chiều ngang (đổi hướng x)
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Phản xạ theo chiều dọc (đổi hướng y)
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xDelta, yDelta);
    }
}

