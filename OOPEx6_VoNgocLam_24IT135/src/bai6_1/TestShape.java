package bai6_1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius()); // Lỗi vì `Shape` không có phương thức `getRadius()`

        Circle c1 = (Circle) s1;  
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); // Lỗi vì `Shape` là abstract, không thể khởi tạo

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); // Lỗi vì `Shape` không có phương thức `getLength()`

        Rectangle r1 = (Rectangle) s3;  
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide()); // Lỗi vì `Shape` không có phương thức `getSide()`

        Rectangle r2 = (Rectangle) s4; 
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide()); // Lỗi vì `Rectangle` không có phương thức `getSide()`
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2; 
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

