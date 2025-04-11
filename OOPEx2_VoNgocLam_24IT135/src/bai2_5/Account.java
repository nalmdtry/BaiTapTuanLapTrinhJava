package bai2_5;

public class Account {
    private int id;
    private Customer customer; // Sử dụng composition: Account chứa một Customer
    private double balance;

    // Constructor khởi tạo một tài khoản với ID, Customer và số dư ban đầu
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor khác chỉ khởi tạo với ID và Customer, số dư mặc định là 0.0
    public Account(int id, Customer customer) {
        this(id, customer, 0.0);
    }

    // Getter trả về ID của tài khoản
    public int getId() {
        return id;
    }

    // Getter trả về Customer của tài khoản
    public Customer getCustomer() {
        return customer;
    }

    // Getter trả về số dư tài khoản
    public double getBalance() {
        return balance;
    }

    // Setter cập nhật số dư tài khoản
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Phương thức trả về tên của Customer
    public String getCustomerName() {
        return customer.getName();
    }

    // Gửi tiền vào tài khoản
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    // Rút tiền, chỉ thực hiện nếu số dư đủ
    public Account withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Số dư không đủ để rút!");
        }
        return this;
    }

    // Phương thức toString() trả về chuỗi biểu diễn đối tượng Account
    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}
