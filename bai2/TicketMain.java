package bai2;

public class TicketMain {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking(10);  // Hệ thống có 10 vé

        // Tạo 3 quầy vé (3 luồng)
        Thread counter1 = new Thread(new TicketCounter(ticketBooking, "Quầy 1"));
        Thread counter2 = new Thread(new TicketCounter(ticketBooking, "Quầy 2"));
        Thread counter3 = new Thread(new TicketCounter(ticketBooking, "Quầy 3"));

        counter1.start();
        counter2.start();
        counter3.start();
    }
}

