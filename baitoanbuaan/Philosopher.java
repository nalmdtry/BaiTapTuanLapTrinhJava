package baitoanbuatoi;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private final int id;
    private final Chopstick leftChopstick;
    private final Chopstick rightChopstick;
    private final Semaphore diningLimit;

    public Philosopher(int id, Chopstick left, Chopstick right, Semaphore diningLimit) {
        this.id = id;
        this.leftChopstick = left;
        this.rightChopstick = right;
        this.diningLimit = diningLimit;
    }

    private void think() throws InterruptedException {
        System.out.println("Triết gia " + id + " đang suy nghĩ...");
        Thread.sleep((long) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("🍽 Triết gia " + id + " đang ăn...");
        Thread.sleep((long) (Math.random() * 1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();

                diningLimit.acquire();  // Kiểm soát số triết gia ăn cùng lúc
                
                if (leftChopstick.pickUp()) {
                    if (rightChopstick.pickUp()) {
                        eat();
                        rightChopstick.putDown();
                    }
                    leftChopstick.putDown();
                }
                
                diningLimit.release();  // Giải phóng chỗ ăn
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

