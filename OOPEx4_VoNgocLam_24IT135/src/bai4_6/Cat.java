package bai4_6;

public class Cat extends Mammal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Phương thức speak
    public void greets() {
        System.out.println("Meow");
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}

