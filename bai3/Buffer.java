package bai3;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    // Producer thêm sản phẩm vào buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // Chờ nếu buffer đầy
        }
        queue.add(item);
        System.out.println("Producer tạo: " + item);
        notify(); // Báo cho Consumer biết có dữ liệu
    }

    // Consumer lấy sản phẩm từ buffer
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Chờ nếu buffer rỗng
        }
        int item = queue.poll();
        System.out.println("Consumer tiêu thụ: " + item);
        notify(); // Báo cho Producer biết có chỗ trống
        return item;
    }
}

