package bai1;

class OddThread extends Thread {
    private PrintNumbers printNumbers;

    public OddThread(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        printNumbers.printOdd();
    }
}

