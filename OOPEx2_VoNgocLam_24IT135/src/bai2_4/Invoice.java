package bai2_4;

public class Invoice {
    private int id;
    private Customer customer; // Sử dụng composition: Invoice chứa một Customer
    private double amount;

    // Constructor khởi tạo một hóa đơn với id, customer, amount
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getter trả về ID của hóa đơn
    public int getId() {
        return id;
    }

    // Getter trả về đối tượng Customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter cập nhật đối tượng Customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter trả về số tiền của hóa đơn
    public double getAmount() {
        return amount;
    }

    // Setter cập nhật số tiền của hóa đơn
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter trả về ID của khách hàng
    public int getCustomerId() {
        return customer.getId();
    }

    // Getter trả về tên của khách hàng
    public String getCustomerName() {
        return customer.getName();
    }

    // Getter trả về mức giảm giá của khách hàng
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Tính số tiền sau khi giảm giá
    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    // Phương thức toString() trả về chuỗi biểu diễn đối tượng Invoice
    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
    }
}

