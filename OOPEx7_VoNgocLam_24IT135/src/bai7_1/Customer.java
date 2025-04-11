package bai7_1;

public class Customer {
    private String name;
    private String membership;

    public Customer(String name) {
        this.name = name;
        this.membership = "None"; // Mặc định không có membership
    }

    public String getName() {
        return name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        if (membership == null) {
            this.membership = "None"; // Tránh lỗi null
        } else {
            this.membership = membership;
        }
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', membership='" + membership + "'}";
    }
}



