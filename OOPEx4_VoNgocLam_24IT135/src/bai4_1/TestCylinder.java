package bai4_1;

public class TestCylinder {
    public static void main(String[] args) {
        // Kiểm thử constructor mặc định
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder: " + c1);

        // Kiểm thử constructor với chiều cao
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder: " + c2);

        // Kiểm thử constructor với bán kính và chiều cao
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: " + c3);

        // Kiểm thử constructor với bán kính, chiều cao và màu sắc
        Cylinder c4 = new Cylinder(2.0, 10.0, "blue");
        System.out.println("Cylinder: " + c4);

        // Kiểm tra diện tích và thể tích
        System.out.println("c4 Base Area: " + c4.getArea()); // Gọi getArea() đã ghi đè
        System.out.println("c4 Volume: " + c4.getVolume()); // Gọi getVolume()
    }
}

