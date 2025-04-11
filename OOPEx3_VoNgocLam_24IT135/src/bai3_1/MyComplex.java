package bai3_1;

public class MyComplex {
    private double real;
    private double imag;

    // Constructors
    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters và Setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // ToString
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    // Kiểm tra số thực, số ảo
    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0 && imag != 0;
    }

    // So sánh số phức
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    // Độ lớn của số phức
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Đối số (góc) của số phức
    public double argument() {
        return Math.atan2(imag, real);
    }

    // Phép toán cộng
    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    // Phép toán trừ
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    // Phép toán nhân
    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    // Phép toán chia
    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    // Phép liên hợp
    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
