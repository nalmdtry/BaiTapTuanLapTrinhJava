package bai4_5;

public class Square extends Rectangle {
    // Constructor không tham số
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor có tham số side
    public Square(double side) {
        super(side, side);
    }

    // Constructor đầy đủ
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter và Setter
    public double getSide() {
        return getWidth();  // Vì width = length trong Square
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Ghi đè setWidth và setLength để duy trì hình vuông
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}

