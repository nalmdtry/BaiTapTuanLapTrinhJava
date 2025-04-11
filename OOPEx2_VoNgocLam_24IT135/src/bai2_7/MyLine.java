package bai2_7;

public class MyLine {
    private MyPoint begin; // Điểm bắt đầu
    private MyPoint end;   // Điểm kết thúc

    // Constructor khởi tạo với tọa độ (x1, y1) và (x2, y2)
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor khởi tạo với hai đối tượng MyPoint
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter cho begin
    public MyPoint getBegin() {
        return begin;
    }

    // Setter cho begin
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter cho end
    public MyPoint getEnd() {
        return end;
    }

    // Setter cho end
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter cho tọa độ x của begin
    public int getBeginX() {
        return begin.getX();
    }

    // Setter cho tọa độ x của begin
    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Getter cho tọa độ y của begin
    public int getBeginY() {
        return begin.getY();
    }

    // Setter cho tọa độ y của begin
    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Getter cho tọa độ x của end
    public int getEndX() {
        return end.getX();
    }

    // Setter cho tọa độ x của end
    public void setEndX(int x) {
        end.setX(x);
    }

    // Getter cho tọa độ y của end
    public int getEndY() {
        return end.getY();
    }

    // Setter cho tọa độ y của end
    public void setEndY(int y) {
        end.setY(y);
    }

    // Phương thức đặt tọa độ cho begin
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Phương thức đặt tọa độ cho end
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài đoạn thẳng
    public double getLength() {
        return begin.distance(end);
    }

    // Tính góc (theo radian) của đoạn thẳng so với trục hoành
    public double getGradient() {
        int deltaX = end.getX() - begin.getX();
        int deltaY = end.getY() - begin.getY();
        return Math.atan2(deltaY, deltaX); // Trả về giá trị góc tính bằng radian
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}

