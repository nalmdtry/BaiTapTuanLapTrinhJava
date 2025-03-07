package baitoanbuatoi;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Chopstick[] chopsticks = new Chopstick[numPhilosophers];
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Semaphore diningLimit = new Semaphore(numPhilosophers - 1);  // Chỉ cho phép tối đa 4 triết gia ăn cùng lúc

        // Khởi tạo nĩa
        for (int i = 0; i < numPhilosophers; i++) {
            chopsticks[i] = new Chopstick();
        }

        // Khởi tạo triết gia
        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % numPhilosophers], diningLimit);
            philosophers[i].start();
        }
    }
}

