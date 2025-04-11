package bai2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Tạo tam giác bằng tọa độ
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Triangle Type: " + t1.printType());

        // Tạo tam giác bằng MyPoint
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 1);
        MyPoint p3 = new MyPoint(2, 5);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Triangle Type: " + t2.printType());

        // Tạo tam giác đều (Sửa lỗi ép kiểu)
        MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, (int) (Math.sqrt(3) * 2));
        System.out.println(t3);
        System.out.println("Perimeter: " + t3.getPerimeter());
        System.out.println("Triangle Type: " + t3.printType());
    }
}




