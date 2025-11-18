//task5
public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(100.5);
        System.out.println(clock);  // Clock time: 100.50

        Clock another = Clock.getInstance();
        System.out.println(another == clock);  // if true → same object
    }
}