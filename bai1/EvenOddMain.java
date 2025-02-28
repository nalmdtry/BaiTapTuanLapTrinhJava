package bai1;

public class EvenOddMain {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();

        Thread evenThread = new EvenThread(printNumbers);
        Thread oddThread = new OddThread(printNumbers);

        evenThread.start();
        oddThread.start();
    }
}

