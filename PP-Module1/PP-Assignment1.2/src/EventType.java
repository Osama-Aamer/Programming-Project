//task3
public enum EventType {
    ARRIVAL("Customer Arrival"),
    DEPARTURE("Customer Departure"),
    SERVICE_START("Service Start"),
    SERVICE_END("Service End");

    private final String description;

    EventType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}