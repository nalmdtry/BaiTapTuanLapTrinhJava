package bai2;

public class TicketBooking {
    private int tickets;  // Số lượng vé
    private final Object lock = new Object(); // Đối tượng khóa

    public TicketBooking(int totalTickets) {
        this.tickets = totalTickets;
    }

    // Phương thức bán vé (đồng bộ hóa để tránh bán trùng vé)
    public void bookTicket(String counterName) {
        synchronized (lock) {
            if (tickets > 0) {
                System.out.println(counterName + " bán vé số " + tickets);
                tickets--;
                try {
                    Thread.sleep(100); // Giả lập thời gian bán vé
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(counterName + " thấy hết vé.");
            }
        }
    }

    // Kiểm tra còn vé không
    public boolean hasTickets() {
        return tickets > 0;
    }
}

