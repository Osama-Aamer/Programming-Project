// task6
import distributions.*;

public class ArrivalTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();

        ContinuousGenerator gen = new Negexp(10.0);  // avg of 10 units between arrivals
        ArrivalProcess arrival = new ArrivalProcess(gen, EventType.ARRIVAL);

        clock.setTime(0);
        for (int i = 0; i < 10; i++) {
            arrival.generateNextArrival(eventList);
        }

        eventList.printEvents();
    }
}