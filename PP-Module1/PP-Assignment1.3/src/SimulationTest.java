// task7
import distributions.*;

public class SimulationTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();

        // Generate 10 arrivals
        ContinuousGenerator gen = new Negexp(8.0);  // avg 8 units
        ArrivalProcess arrivals = new ArrivalProcess(gen, EventType.ARRIVAL);

        clock.setTime(0);
        for (int i = 0; i < 10; i++) {
            arrivals.generateNextArrival(eventList);
        }

        System.out.println("Final clock after arrivals: " + clock.getTime());

        // Process all arrivals
        while (!eventList.isEmpty()) {
            Event e = eventList.getNextEvent();
            clock.setTime(e.getTime());
            Customer c = new Customer();
            c.setArrivalTime(clock.getTime());
            servicePoint.addToQueue(c);
            System.out.printf("Customer %d arrived at %.2f\n", c.getId(), c.getArrivalTime());
        }

        // Move clock forward and serve
        clock.setTime(clock.getTime() + 5);

        System.out.println("\nServing customers...");
        while (!servicePoint.isEmpty()) {
            Customer c = servicePoint.removeFromQueue();
            c.setDepartureTime(clock.getTime());
            double timeInSystem = c.getDepartureTime() - c.getArrivalTime();
            System.out.printf("Customer %d spent %.2f units in system\n", c.getId(), timeInSystem);
        }
    }
}