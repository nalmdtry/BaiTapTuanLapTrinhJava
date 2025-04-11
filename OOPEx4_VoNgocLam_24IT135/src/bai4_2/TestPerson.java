package bai4_2;

public class TestPerson {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person p1 = new Person("Nguyen Van A", "Hanoi");
        System.out.println(p1);

        // Tạo đối tượng Student
        Student s1 = new Student("Tran Thi B", "HCMC", "IT", 2024, 1500.0);
        System.out.println(s1);

        // Tạo đối tượng Staff
        Staff st1 = new Staff("Le Van C", "Da Nang", "ABC High School", 2000.0);
        System.out.println(st1);
    }
}

