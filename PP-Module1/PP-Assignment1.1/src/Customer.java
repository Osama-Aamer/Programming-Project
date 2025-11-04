// OrientationTask1_3.java
public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int nextId = 1;  // Auto-incrementing ID

    public Customer() {
        this.id = nextId++;
        this.startTime = 0;
        this.endTime = 0;
    }

    public int getId() { return id; }
    public long getStartTime() { return startTime; }
    public long getEndTime() { return endTime; }

    public void setStartTime(long startTime) { this.startTime = startTime; }
    public void setEndTime(long endTime) { this.endTime = endTime; }

    // Time spent (end - start)
    public long duration() {
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return "Customer " + id + ": " + duration() + " ms";
    }

    // === TEST PROGRAM (Task 3) ===
    public static void main(String[] args) {
        System.out.println("=== Customer Class Test (Task 3) ===\n");

        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();

        c1.setStartTime(System.nanoTime());
        sleep(1000);
        c1.setEndTime(System.nanoTime());
        System.out.println(c1);

        c2.setStartTime(System.nanoTime());
        sleep(100);
        c2.setEndTime(System.nanoTime());
        System.out.println(c2);

        System.out.println(c3);  // No time set
        System.out.println();
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}