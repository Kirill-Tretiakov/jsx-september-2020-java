package homework5.task2;

import java.util.Objects;

public class Seance implements Comparable<Seance>{

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime, Time endTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int minutes = (int) (startTime.getMin() + (movie.getDuration().toMinutes() % 60));
        int hours;
        if (minutes >= 60){
            hours = (int) (startTime.getHour() + movie.getDuration().toHours()) + 1;
            if (hours > 23)
                hours -= 24;
            minutes -= 60;
        }
        else
            hours = (int) (startTime.getHour() + movie.getDuration().toHours());

        this.endTime = new Time(hours, minutes);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime) &&
                Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Seance o) {
        return this.startTime.getHour() - o.startTime.getHour();
    }
}
