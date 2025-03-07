package baitoanphanbotainguyen;

public class Main {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        Thread threadA = new Thread(new Task("Thread A", resource1, resource2));
        Thread threadB = new Thread(new Task("Thread B", resource2, resource1));

        threadA.start();
        threadB.start();
    }
}
