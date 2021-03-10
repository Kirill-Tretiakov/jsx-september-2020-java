package homework5.task2;

import java.util.Objects;

public class Time {

    private int hour;
    private int min;

    public Time() {
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 60)
            this.hour = hour;
    }

    public void setMin(int min) {
        if (min >= 0 && min < 60)
            this.min = min;
    }

    public Time(int hour, int min) {
        if ((hour >= 0 && hour < 60) && (min >= 0 && min < 60)) {
            this.hour = hour;
            this.min = min;
        }
        else System.out.println("Wrong time settings!");

    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                min == time.min;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, min);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                '}';
    }
}
