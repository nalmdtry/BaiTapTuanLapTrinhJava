package baitoanphanbotainguyen;

public class Task implements Runnable {
    private final String name;
    private final Resource firstResource;
    private final Resource secondResource;

    public Task(String name, Resource res1, Resource res2) {
        this.name = name;
        // Để tránh deadlock, luôn sắp xếp tài nguyên theo thứ tự cố định
        if (res1.hashCode() < res2.hashCode()) {
            this.firstResource = res1;
            this.secondResource = res2;
        } else {
            this.firstResource = res2;
            this.secondResource = res1;
        }
    }

    @Override
    public void run() {
        synchronized (firstResource) {
            System.out.println(name + " locked " + firstResource.getName());

            try { Thread.sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }

            synchronized (secondResource) {
                System.out.println(name + " locked " + secondResource.getName());
            }
        }
    }
}
