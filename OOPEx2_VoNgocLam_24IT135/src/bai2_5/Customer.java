package bai2_5;

public class Customer {
    private int id;
    private String name;
    private char gender; // 'm' hoặc 'f'

    // Constructor khởi tạo Customer với id, name, gender
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // Getter trả về ID của khách hàng
    public int getId() {
        return id;
    }

    // Getter trả về tên của khách hàng
    public String getName() {
        return name;
    }

    // Getter trả về giới tính của khách hàng
    public char getGender() {
        return gender;
    }

    // Phương thức toString() trả về chuỗi biểu diễn đối tượng Customer
    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}

