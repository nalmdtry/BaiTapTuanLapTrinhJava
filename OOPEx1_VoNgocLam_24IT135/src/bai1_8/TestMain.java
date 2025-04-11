package bai1_8;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor và toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // 01:02:03

        // Test Setters và Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // 04:05:06
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // 23:59:58

        // Test nextSecond()
        System.out.println(t1.nextSecond());  // 23:59:59
        System.out.println(t1.nextSecond().nextSecond());  // 00:00:01

        // Test previousSecond()
        System.out.println(t1.previousSecond());  // 00:00:00
        System.out.println(t1.previousSecond().previousSecond());  // 23:59:58
    }
}
