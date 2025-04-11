package bai6_6;

public abstract class Mammal extends Animal {
 public Mammal(String name) {
     super(name);
 }

 @Override
 public String toString() {
     return "Mammal[name=" + name + "]";
 }
}


