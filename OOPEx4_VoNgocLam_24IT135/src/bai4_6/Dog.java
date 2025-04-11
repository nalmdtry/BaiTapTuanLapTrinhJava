package bai4_6;

public class Dog extends Mammal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Phương thức bark
    public void greets() {
        System.out.println("Woof");
    }

    // Phương thức chào một con chó khác
    public void greets(Dog another) {
        System.out.println("Woooooof");
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

