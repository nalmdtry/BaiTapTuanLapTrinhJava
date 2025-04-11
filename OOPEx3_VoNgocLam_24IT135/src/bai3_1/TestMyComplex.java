package bai3_1;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.1, 2.2);
        MyComplex c2 = new MyComplex(3.3, 4.4);

        System.out.println("Number 1 is: " + c1);
        System.out.println(c1 + (c1.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c1 + (c1.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        System.out.println("Number 2 is: " + c2);
        System.out.println(c2 + (c2.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c2 + (c2.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        System.out.println(c1 + (c1.equals(c2) ? " is equal to " : " is NOT equal to ") + c2);

        System.out.println(c1 + " + " + c2 + " = " + c1.addNew(c2));
        System.out.println(c1 + " - " + c2 + " = " + c1.subtractNew(c2));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(new MyComplex(c2.getReal(), c2.getImag())));
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(new MyComplex(c2.getReal(), c2.getImag())));
        System.out.println("Conjugate of " + c1 + " = " + c1.conjugate());
    }
}

