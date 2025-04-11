package bai2_8;

public class MyPoint {
    private int x;
    private int y;

    // Constructor mặc định, tạo điểm (0, 0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor khởi tạo điểm với tọa độ cho trước
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public int getX() {
        return x;
    }

    // Setter cho x
    public void setX(int x) {
        this.x = x;
    }

    // Getter cho y
    public int getY() {
        return y;
    }

    // Setter cho y
    public void setY(int y) {
        this.y = y;
    }

    // Phương thức thiết lập cả x và y cùng lúc
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức trả về tọa độ x và y dưới dạng mảng
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Phương thức tính khoảng cách đến một điểm khác (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Phương thức tính khoảng cách đến một điểm MyPoint khác
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Phương thức tính khoảng cách từ điểm này đến gốc tọa độ (0, 0)
    public double distance() {
        return distance(0, 0);
    }

    // Phương thức toString để hiển thị tọa độ của điểm
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

