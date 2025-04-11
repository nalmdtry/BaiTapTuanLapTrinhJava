package bai5_1;

public class LineSub extends Point {
    // Chỉ cần thêm điểm kết thúc
    private Point end;

    // Constructor nhận tọa độ
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    // Constructor nhận 2 điểm
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    // Getters và Setters
    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài đoạn thẳng
    public double getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Tính góc (gradient)
    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Line from (" + getX() + ", " + getY() + ") to " + end;
    }
}

