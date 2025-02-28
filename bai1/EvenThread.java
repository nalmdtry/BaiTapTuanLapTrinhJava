package bai1;

class EvenThread extends Thread {
    private PrintNumbers printNumbers;

    public EvenThread(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        printNumbers.printEven();
    }
}

