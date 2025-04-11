package bai7_2;

import java.util.*;

public class PolyLine {
    private List<Point> points; // Danh sách các điểm

    // Constructor mặc định
    public PolyLine() {
        points = new ArrayList<>();
    }

    // Constructor nhận danh sách các điểm
    public PolyLine(List<Point> points) {
        this.points = points;
    }

    // Thêm một điểm vào polyline
    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    // Tính tổng chiều dài của polyline
    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i - 1).distance(points.get(i));
        }
        return length;
    }

    // Chuỗi biểu diễn danh sách điểm
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point p : points) {
            sb.append(p.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
