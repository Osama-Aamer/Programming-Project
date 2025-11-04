// CustomerGenerator.java
public class CustomerGenerator {

    // For Task 5: ServicePoint
    public static void generateForServicePoint(ServicePoint servicePoint, int count) {
        for (int i = 0; i < count; i++) {
            Customer c = new Customer();
            c.setStartTime(System.nanoTime());
            servicePoint.addToQueue(c);
        }
        System.out.println("Generated " + count + " customers for ServicePoint.");
    }

    // For Task 6: ServicePointWithStats
    public static void generateForServicePointWithStats(ServicePointWithStats servicePoint, int count) {
        for (int i = 0; i < count; i++) {
            Customer c = new Customer();
            c.setStartTime(System.nanoTime());
            servicePoint.addToQueue(c);
        }
        System.out.println("Generated " + count + " customers for ServicePointWithStats.");
    }
}