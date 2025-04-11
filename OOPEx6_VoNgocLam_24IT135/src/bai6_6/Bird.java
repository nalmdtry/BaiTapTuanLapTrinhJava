package bai6_6;

public abstract class Bird extends Animal {
public Bird(String name) {
   super(name);
}

@Override
public String toString() {
   return "Bird[name=" + name + "]";
}
}
