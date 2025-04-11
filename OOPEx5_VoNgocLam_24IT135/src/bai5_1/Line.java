package bai5_1;

public class Line {
    // Sử dụng composition: Line có 2 điểm
    private Point begin;
    private Point end;

    // Constructor nhận đối tượng Point
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor nhận tọa độ trực tiếp
    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    // Getters
    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    // Setters
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Lấy tọa độ của 2 điểm
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Thay đổi tọa độ từng điểm
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài đoạn thẳng
    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Tính góc (gradient)
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Line from " + begin + " to " + end;
    }
}

