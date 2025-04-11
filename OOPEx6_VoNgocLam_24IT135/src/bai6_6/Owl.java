package bai6_6;

public class Owl extends Bird {
    public Owl(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Hoot!");
    }
}
