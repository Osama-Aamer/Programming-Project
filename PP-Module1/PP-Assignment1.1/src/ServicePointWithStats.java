// OrientationTask1_6.java
import java.util.LinkedList;

public class ServicePointWithStats {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int servedCount = 0;

    public void addToQueue(Customer c) {
        queue.addFirst(c);
    }

    public Customer removeFromQueue() {
        return queue.isEmpty() ? null : queue.removeLast();
    }

    public void serve() {
        System.out.println("\n=== Service Point with Statistics (Task 6) ===\n");

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

            totalServiceTime += serviceTime;
            servedCount++;

            System.out.printf("Served %s | Wait: %d ms | Service: %d ms | Response: %d ms%n",
                    c, waitTime / 1_000_000, serviceTime / 1_000_000, responseTime / 1_000_000);
        }

        if (servedCount > 0) {
            double avgServiceTime = totalServiceTime / (double) servedCount / 1_000_000;
            System.out.printf("\nAverage service time: %.2f ms (over %d customers)%n", avgServiceTime, servedCount);
        }
    }
    // === TEST PROGRAM (Task 6) ===
    public static void main(String[] args) {
        ServicePointWithStats sp = new ServicePointWithStats();
        CustomerGenerator.generateForServicePointWithStats(sp, 5);
        sp.serve();
    }
}