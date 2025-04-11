package bai2_1;

public class Author {
    private String name;
    private String email;
    private char gender; // 'm' hoặc 'f'

    // Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return String.format("Author[name=%s,email=%s,gender=%c]", name, email, gender);
    }
}

