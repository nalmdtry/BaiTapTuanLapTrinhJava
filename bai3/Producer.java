package bai3;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 1;
        while (true) {
            try {
                buffer.produce(item++);
                Thread.sleep(500); // Giả lập thời gian sản xuất
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

