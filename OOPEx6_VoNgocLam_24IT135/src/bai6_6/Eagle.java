package bai6_6;

public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Screech!");
    }
}