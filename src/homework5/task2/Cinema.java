package homework5.task2;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Cinema {

    private TreeMap<Days, Scedule> rozklad;
    private Time open;
    private Time close;

    public Cinema(TreeMap<Days, Scedule> rozklad, Time open, Time close) {
        this.rozklad = rozklad;
        this.open = open;
        this.close = close;
    }

    public void addSeances(String day, Seance... seances) {
        Days thisDay = null;
        for (Days days : Days.values()) {
            if (days.toString().equals(day))
                thisDay = days;
        }
        if (thisDay == null) System.out.println("something went wrong!");
        else
            for (Seance seance : seances)
                rozklad.get(thisDay).addSeance(seance);
    }

    public void addSeance(Seance seance, String day) {
        Days thisDay = null;
        for (Days days : Days.values()) {
            if (days.toString().equals(day))
                thisDay = days;
        }
        if (thisDay == null) System.out.println("something went wrong!");
        else
            rozklad.get(thisDay).addSeance(seance);
    }

    public void removeMovie(String title) {
        for (Map.Entry<Days, Scedule> entry : rozklad.entrySet()) {
            Iterator<Seance> iter = entry.getValue().getSeanceSet().iterator();
            while (iter.hasNext()) {
                if (iter.next().getMovie().getTitle().equals(title)) {
                    iter.remove();
                }
            }
        }
    }

    public void removeSeance(Seance seance, String day) {
        for (Days day1 : Days.values()) {
            if (day1.toString().equals(day)) {
                rozklad.get(day1).removeSeance(seance);
            }
        }

    }

    public TreeMap<Days, Scedule> getRozklad() {
        return rozklad;
    }

    public void setRozklad(TreeMap<Days, Scedule> rozklad) {
        this.rozklad = rozklad;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(rozklad, cinema.rozklad) &&
                Objects.equals(open, cinema.open) &&
                Objects.equals(close, cinema.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rozklad, open, close);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "rozklad=" + rozklad +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}

