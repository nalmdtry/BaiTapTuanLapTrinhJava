package bai4_6;

public class TestAnimal {
    public static void main(String[] args) {
        // Kiểm thử Animal
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        // Kiểm thử Mammal
        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal);

        // Kiểm thử Cat
        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        // Kiểm thử Dog
        Dog dog1 = new Dog("Buddy");
        System.out.println(dog1);
        dog1.greets();

        // Kiểm thử greet giữa 2 con chó
        Dog dog2 = new Dog("Max");
        dog1.greets(dog2);
    }
}

