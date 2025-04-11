package bai1_1;

public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Circle c1 = new Circle();
        System.out.println("Circle 1: " + c1);
        System.out.println("Area: " + c1.getArea());

        // Tạo đối tượng với bán kính tùy chỉnh
        Circle c2 = new Circle(2.5);
        System.out.println("Circle 2: " + c2);
        System.out.println("Area: " + c2.getArea());

        // Tạo đối tượng với cả bán kính và màu sắc tùy chỉnh
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Circle 3: " + c3);
        System.out.println("Area: " + c3.getArea());
    }
}
