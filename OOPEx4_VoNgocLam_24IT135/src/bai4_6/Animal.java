package bai4_6;

public class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}

