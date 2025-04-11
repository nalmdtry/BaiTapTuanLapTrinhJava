package bai4_5;

public class Shape {
    private String color;
    private boolean filled;

    // Constructor không tham số
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor có tham số
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter và Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {  // Đúng quy tắc đặt tên getter cho boolean
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}

