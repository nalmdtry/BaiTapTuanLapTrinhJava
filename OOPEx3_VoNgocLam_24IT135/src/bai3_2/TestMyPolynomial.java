package bai3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        // Tạo hai đa thức
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.0, 1.0, 1.0, 1.0);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        // Kiểm tra bậc của đa thức
        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Degree of p2: " + p2.getDegree());

        // Tính giá trị của p1 tại x = 2
        System.out.println("p1(2) = " + p1.evaluate(2));

        // Cộng hai đa thức
        MyPolynomial sum = p1.add(p2);
        System.out.println("p1 + p2 = " + sum);

        // Nhân hai đa thức
        MyPolynomial product = p1.multiply(p2);
        System.out.println("p1 * p2 = " + product);
    }
}

