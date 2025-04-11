package bai5_2;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder();
        System.out.println("Cylinder 1: " + cyl1);
        System.out.println("Surface Area: " + cyl1.getSurfaceArea());
        System.out.println("Volume: " + cyl1.getVolume());

        Cylinder cyl2 = new Cylinder(5.0, 10.0, "blue");
        System.out.println("\nCylinder 2: " + cyl2);
        System.out.println("Surface Area: " + cyl2.getSurfaceArea());
        System.out.println("Volume: " + cyl2.getVolume());
    }
}

