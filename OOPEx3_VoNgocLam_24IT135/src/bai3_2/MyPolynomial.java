package bai3_2;

public class MyPolynomial {
    private double[] coeffs;  // Mảng chứa hệ số của đa thức

    // Constructor với varargs
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Lấy bậc của đa thức (chính là độ dài mảng - 1)
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Chuyển đa thức thành chuỗi dạng cn*x^n + ... + c1*x + c0
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (Math.abs(coeffs[i]) < 1e-9) continue; // Bỏ qua hệ số gần bằng 0

            if (sb.length() > 0) sb.append(" + ");
            sb.append(String.format("%.2f", coeffs[i])); // Giới hạn 2 chữ số thập phân

            if (i > 0) sb.append("x^").append(i);
        }
        return sb.toString();
    }


    // Tính giá trị của đa thức tại x
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Cộng hai đa thức
    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            newCoeffs[i] += this.coeffs[i];
        }
        for (int i = 0; i <= another.getDegree(); i++) {
            newCoeffs[i] += another.coeffs[i];
        }

        return new MyPolynomial(newCoeffs);
    }

    // Nhân hai đa thức
    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}

