// task6
import distributions.Negexp;
import distributions.ContinuousGenerator;

public class ArrivalProcess {
    private ContinuousGenerator generator;
    private EventType type;
    private Clock clock;

    public ArrivalProcess(ContinuousGenerator generator, EventType type) {
        this.generator = generator;
        this.type = type;
        this.clock = Clock.getInstance();
    }

    public void generateNextArrival(EventList eventList) {
        double nextTime = clock.getTime() + generator.sample();
        eventList.addEvent(new Event(type, nextTime));
        System.out.printf("Arrival scheduled at %.2f\n", nextTime);
    }
}