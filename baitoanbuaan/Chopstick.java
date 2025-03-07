package baitoanbuatoi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private final Lock lock = new ReentrantLock();

    public boolean pickUp() {
        return lock.tryLock();  // Cố gắng lấy nĩa
    }

    public void putDown() {
        lock.unlock();  // Đặt nĩa xuống
    }
}
