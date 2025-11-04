// OrientationTask1_4.java
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueue {
    private static LinkedList<Customer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Customer Queue System (Task 4) ===\n");
        System.out.println("Commands: 'add' | 'remove' | 'quit'");

        while (true) {
            System.out.print("\n> ");
            String cmd = scanner.nextLine().trim().toLowerCase();

            if (cmd.equals("add")) {
                Customer c = new Customer();
                c.setStartTime(System.nanoTime());
                queue.addFirst(c);  // FIFO: add to front
                System.out.println("Added: " + c);

            } else if (cmd.equals("remove")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty!");
                } else {
                    Customer c = queue.removeLast();  // FIFO: remove from back
                    c.setEndTime(System.nanoTime());
                    System.out.println("Removed: " + c);
                }

            } else if (cmd.equals("quit")) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid command. Use: add, remove, quit");
            }

            System.out.println("Queue size: " + queue.size());
        }
        scanner.close();
    }
}