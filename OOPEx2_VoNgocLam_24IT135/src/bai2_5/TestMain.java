package bai2_5;

public class TestMain {
    public static void main(String[] args) {
        // Khởi tạo một khách hàng
        Customer c1 = new Customer(101, "Alice", 'f');
        System.out.println(c1); // Kiểm tra phương thức toString() của Customer

        // Khởi tạo một tài khoản có khách hàng là c1
        Account acc1 = new Account(1001, c1, 500.0);
        System.out.println(acc1); // Kiểm tra phương thức toString() của Account

        // Kiểm tra nạp tiền
        acc1.deposit(200.0);
        System.out.println("Sau khi nạp 200: " + acc1);

        // Kiểm tra rút tiền hợp lệ
        acc1.withdraw(100.0);
        System.out.println("Sau khi rút 100: " + acc1);

        // Kiểm tra rút tiền không hợp lệ
        acc1.withdraw(700.0); // Không đủ tiền rút
        System.out.println("Sau khi cố gắng rút 700: " + acc1);
    }
}

