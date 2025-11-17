//TASK2
import java.util.PriorityQueue;

public class EventList {
    private final PriorityQueue<Event> queue;

    public EventList() {
        this.queue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        queue.offer(event);
    }

    public Event getNextEvent() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // prints in chronological order
    public void printEvents() {
        if (queue.isEmpty()) {
            System.out.println("Event list is empty.");
            return;
        }

        System.out.println("=== Event List (chronological order) ===");
        // basically create a copy to preserve original queue
        PriorityQueue<Event> temp = new PriorityQueue<>(queue);
        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
        System.out.println("========================================");
    }
}