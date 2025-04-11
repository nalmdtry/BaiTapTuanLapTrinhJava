package bai3_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Kiểm tra hợp lệ và đặt giá trị
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    // Setters với kiểm tra hợp lệ
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    // Chuyển đổi thành chuỗi "HH:MM:SS"
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Tăng giây, phút, giờ
    public MyTime nextSecond() {
        if (++second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        if (++minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        if (++hour == 24) {
            hour = 0;
        }
        return this;
    }

    // Giảm giây, phút, giờ
    public MyTime previousSecond() {
        if (--second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (--minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        if (--hour < 0) {
            hour = 23;
        }
        return this;
    }
}

