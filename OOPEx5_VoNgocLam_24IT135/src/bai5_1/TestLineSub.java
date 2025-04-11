package bai5_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(0, 0, 3, 4);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);
        LineSub line2 = new LineSub(p1, p2);
        System.out.println(line2);
        System.out.println("Length: " + line2.getLength());
    }
}

