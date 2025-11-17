// task2
public class SimulationTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // adding events in random order
        eventList.addEvent(new Event(EventType.ARRIVAL, 5.0));
        eventList.addEvent(new Event(EventType.DEPARTURE, 12.0));
        eventList.addEvent(new Event(EventType.ARRIVAL, 0.0));
        eventList.addEvent(new Event(EventType.SERVICE_END, 8.5));
        eventList.addEvent(new Event(EventType.ARRIVAL, 10.0));

        // printing the full list (we sort it by time)
        eventList.printEvents();

        // for removing and processing next events
        System.out.println("Processing events in order:");
        while (!eventList.isEmpty()) {
            Event next = eventList.getNextEvent();
            System.out.println("→ Processing: " + next);
        }
    }
}