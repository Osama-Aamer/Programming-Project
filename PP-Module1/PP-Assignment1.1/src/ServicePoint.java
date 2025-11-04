// OrientationTask1_5.java
import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer c) {
        queue.addFirst(c);
    }

    public Customer removeFromQueue() {
        return queue.isEmpty() ? null : queue.removeLast();
    }

    public void serve() {
        System.out.println("\n=== Service Point Started (Task 5) ===\n");

        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            if (c == null) break;

            long waitTime = System.nanoTime() - c.getStartTime();
            long serviceTime = (long) (Math.random() * 2000) + 500;

            try {
                Thread.sleep(serviceTime / 1_000_000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            c.setEndTime(System.nanoTime());
            long responseTime = c.getEndTime() - c.getStartTime();

            System.out.printf("Served %s | Wait: %d ms | Service: %d ms | Response: %d ms%n",
                    c, waitTime / 1_000_000, serviceTime / 1_000_000, responseTime / 1_000_000);
        }
        System.out.println("\nService point finished. Queue empty.");
    }

    // === TEST PROGRAM (Task 5) ===
    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator.generateForServicePoint(sp, 5);
        sp.serve();
    }
}