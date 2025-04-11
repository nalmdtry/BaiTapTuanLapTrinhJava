package bai2_7;

public class TestMyLine {
    public static void main(String[] args) {
        // Tạo điểm bắt đầu và kết thúc
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);

        // Tạo một đoạn thẳng từ hai điểm trên
        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);

        // Kiểm tra phương thức setBegin và setEnd
        line1.setBegin(new MyPoint(2, 2));
        line1.setEnd(new MyPoint(6, 7));
        System.out.println("After modifying begin and end: " + line1);

        // Kiểm tra phương thức setBeginXY và setEndXY
        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println("After setting new coordinates: " + line1);

        // Kiểm tra độ dài đoạn thẳng
        System.out.println("Length: " + line1.getLength());

        // Kiểm tra góc nghiêng so với trục hoành
        System.out.println("Gradient (radians): " + line1.getGradient());
        System.out.println("Gradient (degrees): " + Math.toDegrees(line1.getGradient()));

        // Kiểm tra các getter riêng lẻ
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());
    }
}

