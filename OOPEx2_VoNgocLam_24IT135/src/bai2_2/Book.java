package bai2_2;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;  // Mảng chứa nhiều tác giả
    private double price;
    private int qty = 0;

    // Constructor với số lượng sách mặc định là 0
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // Constructor với đầy đủ thông tin
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    // Trả về danh sách tên tất cả các tác giả
    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());
            if (i < authors.length - 1) {
                names.append(", ");  // Ngăn cách giữa các tên tác giả
            }
        }
        return names.toString();
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s,authors=%s,price=%.2f,qty=%d]", 
                name, Arrays.toString(authors), price, qty);
    }
}

