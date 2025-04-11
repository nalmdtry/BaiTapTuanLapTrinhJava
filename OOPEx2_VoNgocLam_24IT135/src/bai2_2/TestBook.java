package bai2_2;

public class TestBook {
    public static void main(String[] args) {
        // Khởi tạo mảng chứa nhiều tác giả
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Tạo một cuốn sách với nhiều tác giả
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // Test toString()

        // Kiểm tra các phương thức getter & setter
        javaDummy.setPrice(29.95);
        javaDummy.setQty(50);
        System.out.println("Tên sách: " + javaDummy.getName());
        System.out.println("Giá sách: " + javaDummy.getPrice());
        System.out.println("Số lượng: " + javaDummy.getQty());
        System.out.println("Tác giả: " + javaDummy.getAuthorNames());

        // Kiểm tra danh sách tác giả
        for (Author author : javaDummy.getAuthors()) {
            System.out.println(author);
        }
    }
}

