// task5
public class Clock {
    private static Clock instance = new Clock();
    private double time;

    private Clock() {
        this.time = 0.0;
    }

    public static Clock getInstance() {
        return instance;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("Clock time: %.2f", time);
    }
}