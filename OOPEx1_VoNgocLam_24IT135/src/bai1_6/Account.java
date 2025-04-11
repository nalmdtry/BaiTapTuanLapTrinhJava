package bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor có tham số (id, name, balance)
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor chỉ có (id, name), balance mặc định là 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Getter cho ID
    public String getID() {
        return id;
    }

    // Getter cho Name
    public String getName() {
        return name;
    }

    // Getter cho Balance
    public int getBalance() {
        return balance;
    }

    // Nạp tiền vào tài khoản (credit)
    public void credit(int amount) {
        balance += amount;
    }

    // Rút tiền từ tài khoản (debit)
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Chuyển tiền sang tài khoản khác
    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

