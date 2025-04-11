package bai3_5;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
        System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(d1.nextYear());  // Monday 1 Apr 2013

        System.out.println();

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2.previousDay());   // Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

        System.out.println();

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());  // Monday 28 Feb 2011

        System.out.println();

        // Kiểm tra xử lý ngày không hợp lệ
        try {
            MyDate invalidDate1 = new MyDate(2012, 2, 30);
            System.out.println(invalidDate1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Invalid year, month, or day!
        }

        try {
            MyDate invalidDate2 = new MyDate(2011, 2, 29);
            System.out.println(invalidDate2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Invalid year, month, or day!
        }

        System.out.println();

        // Kiểm tra vòng lặp nextDay()
        MyDate date = new MyDate(2011, 12, 28);
        for (int i = 0; i < 65; i++) {
            System.out.println(date.nextDay());
        }
    }
}


