package bai3_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time);

        // Kiểm tra nextSecond()
        time.nextSecond();
        System.out.println("After nextSecond: " + time); // Expected 00:00:00

        // Kiểm tra nextMinute()
        time.nextMinute();
        System.out.println("After nextMinute: " + time); // Expected 00:01:00

        // Kiểm tra nextHour()
        time.nextHour();
        System.out.println("After nextHour: " + time); // Expected 01:01:00

        // Kiểm tra previousSecond()
        time.previousSecond();
        System.out.println("After previousSecond: " + time); // Expected 01:00:59

        // Kiểm tra previousMinute()
        time.previousMinute();
        System.out.println("After previousMinute: " + time); // Expected 00:59:59

        // Kiểm tra previousHour()
        time.previousHour();
        System.out.println("After previousHour: " + time); // Expected 23:59:59
    }
}

