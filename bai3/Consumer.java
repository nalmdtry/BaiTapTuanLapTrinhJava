package bai3;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1000); // Giả lập thời gian tiêu thụ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

