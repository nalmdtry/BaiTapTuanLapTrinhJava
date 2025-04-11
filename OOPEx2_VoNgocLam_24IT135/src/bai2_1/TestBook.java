package bai2_1;

public class TestBook {
    public static void main(String[] args) {
        // Tạo một instance của Author
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Test Author's toString()

        // Tạo một instance của Book
        Book dummyBook = new Book("Java for Dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook); // Test Book's toString()

        // Test Setters và Getters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Test Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Test phương thức mới để lấy thông tin tác giả từ Book
        System.out.println("Author's name is: " + dummyBook.getAuthorName());
        System.out.println("Author's email is: " + dummyBook.getAuthorEmail());
        System.out.println("Author's gender is: " + dummyBook.getAuthorGender());

        // Sử dụng anonymous instance của Author để tạo Book
        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
