package bai2_4;

public class TestMain {
    public static void main(String[] args) {
        // Khởi tạo một khách hàng
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Kiểm tra phương thức toString() của Customer

        // Thay đổi mức giảm giá của khách hàng
        c1.setDiscount(8);
        System.out.println(c1); // Kiểm tra lại phương thức toString()
        System.out.println("id is: " + c1.getId()); // In ID của khách hàng
        System.out.println("name is: " + c1.getName()); // In tên khách hàng
        System.out.println("discount is: " + c1.getDiscount()); // In mức giảm giá

        // Khởi tạo một hóa đơn có khách hàng là c1
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1); // Kiểm tra phương thức toString() của Invoice

        // Thay đổi số tiền của hóa đơn
        inv1.setAmount(999.9);
        System.out.println(inv1); // Kiểm tra lại phương thức toString()

        // Kiểm tra các phương thức getter
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer()); // In thông tin khách hàng (dùng toString của Customer)
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}

