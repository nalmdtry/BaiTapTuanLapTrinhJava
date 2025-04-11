package bai7_2;

public class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public int getX() {
        return x;
    }

    // Getter cho y
    public int getY() {
        return y;
    }

    // Setter cho x
    public void setX(int x) {
        this.x = x;
    }

    // Setter cho y
    public void setY(int y) {
        this.y = y;
    }

    // Getter cho cả (x, y)
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Setter cho cả (x, y)
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Tính khoảng cách từ điểm hiện tại đến một điểm khác
    public double distance(Point another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Chuỗi biểu diễn tọa độ của điểm
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

