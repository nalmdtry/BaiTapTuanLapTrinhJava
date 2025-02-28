package bai2;

public class TicketCounter implements Runnable {
    private TicketBooking ticketBooking;  // Tham chiếu đến hệ thống bán vé
    private String counterName;  // Tên quầy vé

    public TicketCounter(TicketBooking ticketBooking, String counterName) {
        this.ticketBooking = ticketBooking;
        this.counterName = counterName;
    }

    @Override
    public void run() {
        while (ticketBooking.hasTickets()) {
            ticketBooking.bookTicket(counterName);
        }
    }
}

