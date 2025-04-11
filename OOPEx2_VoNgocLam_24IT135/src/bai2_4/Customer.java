package bai2_4;

public class Customer {
    private int id;
    private String name;
    private int discount; // Phần trăm giảm giá

    // Constructor khởi tạo Customer với id, name, discount
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getter trả về ID của khách hàng
    public int getId() {
        return id;
    }

    // Getter trả về tên của khách hàng
    public String getName() {
        return name;
    }

    // Getter trả về phần trăm giảm giá của khách hàng
    public int getDiscount() {
        return discount;
    }

    // Setter cập nhật phần trăm giảm giá
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // Phương thức toString() trả về chuỗi biểu diễn đối tượng Customer
    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}

