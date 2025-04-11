package bai3_5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    private static final String[] DAYS = {
        "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    };

    private static final int[] DAYS_IN_MONTHS = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int K = year % 100;  // Hai chữ số cuối của năm
        int J = year / 100;   // Hai chữ số đầu của năm

        int h = (day + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        
        int[] dayMap = {6, 0, 1, 2, 3, 4, 5}; // Chuyển đổi sang dạng bắt đầu từ Chủ nhật = 0
        return dayMap[h];
    }


    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }

        if (day < maxDay) {
            day++;
        } else {
            day = 1;
            if (month == 12) {
                month = 1;
                if (year == 9999) {
                    throw new IllegalStateException("Year out of range!");
                }
                year++;
            } else {
                month++;
            }
        }
        return this;
    }


    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            if (year == 9999) throw new IllegalStateException("Year out of range!");
            year++;
        } else {
            month++;
        }
        day = Math.min(day, DAYS_IN_MONTHS[month - 1]);
        if (month == 2 && isLeapYear(year)) {
            day = Math.min(day, 29);
        }
        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) throw new IllegalStateException("Year out of range!");
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            if (month == 1) {
                month = 12;
                day = 31;
                year--;
            } else {
                month--;
                day = DAYS_IN_MONTHS[month - 1];
                if (month == 2 && isLeapYear(year)) {
                    day = 29;
                }
            }
        }
        return this;
    }


    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        day = Math.min(day, DAYS_IN_MONTHS[month - 1]);
        if (month == 2 && isLeapYear(year)) {
            day = Math.min(day, 29);
        }
        return this;
    }

    public MyDate previousYear() {
        if (year == 1) throw new IllegalStateException("Year out of range!");
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
}

