package bai6_7;

public class Dog extends Animal {
 @Override
 public void greeting() {
     System.out.println("Woof!");
 }

 // Overloading: Phương thức này chỉ dùng khi tham số là một Dog khác.
 public void greeting(Dog another) {
     System.out.println("Woooooooooof!");
 }
}

