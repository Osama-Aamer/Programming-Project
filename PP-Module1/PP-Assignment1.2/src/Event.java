//task2
public class Event implements Comparable<Event> {
    private final double time;
    private final EventType type;

    public Event(EventType type, double time) {
        this.type = type;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return String.format("Event{type=%s, time=%.1f}", type, time);
    }
}