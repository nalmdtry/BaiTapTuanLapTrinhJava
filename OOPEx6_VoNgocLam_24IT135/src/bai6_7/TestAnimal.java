package bai6_7;

public class TestAnimal {
 public static void main(String[] args) {
     // 1️⃣ Khởi tạo đối tượng từ lớp con và gọi phương thức greeting()
     Cat cat1 = new Cat();
     cat1.greeting(); // Meow!

     Dog dog1 = new Dog();
     dog1.greeting(); // Woof!

     BigDog bigDog1 = new BigDog();
     bigDog1.greeting(); // Woow!

     // 2️⃣ Đa hình: Upcasting (ép kiểu lên)
     Animal animal1 = new Cat();
     animal1.greeting(); // Meow!

     Animal animal2 = new Dog();
     animal2.greeting(); // Woof!

     Animal animal3 = new BigDog();
     animal3.greeting(); // Woow!

     // ❌ Lỗi: Không thể khởi tạo lớp trừu tượng
     // Animal animal4 = new Animal(); // Compilation error!

     // 3️⃣ Downcasting (ép kiểu xuống)
     Dog dog2 = (Dog) animal2;  // OK vì animal2 thực chất là Dog
     BigDog bigDog2 = (BigDog) animal3;  // OK vì animal3 thực chất là BigDog
     Dog dog3 = (Dog) animal3;  // OK vì animal3 là BigDog (BigDog là một Dog)

     // ❌ Lỗi: Không thể ép Dog sang Cat
     // Cat cat2 = (Cat) animal2; // ClassCastException tại runtime

     // 4️⃣ Gọi phương thức nạp chồng
     dog2.greeting(dog3);   // "Woooooooooof!" (Dog gọi với Dog)
     dog3.greeting(dog2);   // "Woooooowwwww!" (BigDog gọi với Dog)
     dog2.greeting(bigDog2); // "Woooooooooof!" (Dog gọi với BigDog)
     bigDog2.greeting(dog2); // "Woooooowwwww!" (BigDog gọi với Dog)
     bigDog2.greeting(bigDog1); // "Woooooowwwww!" (BigDog gọi với BigDog)
 }
}
