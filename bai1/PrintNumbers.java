package bai1;

class PrintNumbers {
    private int number = 1;
    private final int MAX = 20; // Giới hạn số cần in

    public synchronized void printEven() {
        while (number <= MAX) {
            while (number % 2 != 0) {  // Chờ nếu số hiện tại là lẻ
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (number <= MAX) {
                System.out.println("Chẵn: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (number % 2 == 0) {  // Chờ nếu số hiện tại là chẵn
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (number <= MAX) {
                System.out.println("Lẻ: " + number);
                number++;
                notify();
            }
        }
    }
}

