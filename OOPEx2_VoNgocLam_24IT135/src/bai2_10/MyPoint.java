package bai2_10;

public class MyPoint {
    private int x, y;

    // Constructor mặc định (điểm gốc)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor có tham số
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters và Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    // Tính khoảng cách đến điểm khác
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

