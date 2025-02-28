package bai3;

public class TestMain {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Tạo buffer với dung lượng 5

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}

