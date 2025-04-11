package bai4_6;

public class Mammal extends Animal {
    // Constructor
    public Mammal(String name) {
        super(name);
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

