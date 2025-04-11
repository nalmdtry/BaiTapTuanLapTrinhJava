package bai6_6;

public abstract class Animal {
 protected String name;

 public Animal(String name) {
     this.name = name;
 }

 public abstract void makeSound(); // Abstract method

 @Override
 public String toString() {
     return "Animal[name=" + name + "]";
 }
}

