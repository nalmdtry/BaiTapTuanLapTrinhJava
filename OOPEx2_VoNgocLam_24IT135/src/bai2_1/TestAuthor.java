package bai2_1;

public class TestAuthor {
    public static void main(String[] args) {
        // Tạo một instance của Author
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        // Test toString()
        System.out.println(ahTeck); // Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m]

        // Test setter
        ahTeck.setEmail("paulTan@nowhere.com");

        // Test getter
        System.out.println("name is: " + ahTeck.getName());    
        System.out.println("email is: " + ahTeck.getEmail());  
        System.out.println("gender is: " + ahTeck.getGender());
    }
}

