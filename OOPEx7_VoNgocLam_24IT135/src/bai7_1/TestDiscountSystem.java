package bai7_1;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.setMembership("Premium");

        Customer bob = new Customer("Bob");
        bob.setMembership("Gold");

        Customer charlie = new Customer("Charlie"); // Không có membership

        Visit visitAlice = new Visit(alice, 100, 50);
        Visit visitBob = new Visit(bob, 200, 100);
        Visit visitCharlie = new Visit(charlie, 150, 80);

        System.out.println("Alice phải trả: $" + visitAlice.getTotalExpense());
        System.out.println("Bob phải trả: $" + visitBob.getTotalExpense());
        System.out.println("Charlie phải trả: $" + visitCharlie.getTotalExpense());
    }
}


