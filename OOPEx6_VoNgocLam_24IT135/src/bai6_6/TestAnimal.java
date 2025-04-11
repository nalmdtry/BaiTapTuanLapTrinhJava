package bai6_6;

public class TestAnimal {
 public static void main(String[] args) {
     Animal cat = new Cat("Whiskers");
     Animal dog = new Dog("Buddy");
     Animal eagle = new Eagle("Majestic");
     Animal owl = new Owl("Hedwig");

     System.out.println(cat);
     cat.makeSound();

     System.out.println(dog);
     dog.makeSound();

     System.out.println(eagle);
     eagle.makeSound();

     System.out.println(owl);
     owl.makeSound();
 }
}

