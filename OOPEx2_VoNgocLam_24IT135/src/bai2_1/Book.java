package bai2_1;

public class Book {
    private String name;
    private Author author; // Biến kiểu Author
    private double price;
    private int qty = 0; // Mặc định là 0

    // Constructor 1 (không có qty)
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor 2 (có qty)
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Các phương thức tiện ích để lấy thông tin tác giả từ Book
    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return String.format("Book[name=%s,%s,price=%.2f,qty=%d]", name, author, price, qty);
    }
}
