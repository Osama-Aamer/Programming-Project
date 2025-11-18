import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer c) { queue.addLast(c); }
    public Customer removeFromQueue() { return queue.pollFirst(); }
    public boolean isEmpty() { return queue.isEmpty(); }
}