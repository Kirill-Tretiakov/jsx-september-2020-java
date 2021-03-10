package homework5.task2;

import java.time.Duration;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Гарри Поттер и философский камень", Duration.ofMinutes(90));
        Movie movie2 = new Movie("Гарри Поттер и кубок огня", Duration.ofMinutes(100));
        Movie movie3 = new Movie("Гарри Поттер и узник азкабана", Duration.ofMinutes(70));
        Movie movie4 = new Movie("Сверхестественное", Duration.ofMinutes(103));
        Movie movie5 = new Movie("Том и Джерри", Duration.ofMinutes(121));
        Movie movie6 = new Movie("Наруто", Duration.ofMinutes(111));
        Movie movie7 = new Movie("Екпипаж", Duration.ofMinutes(270));

        Seance seance1 = new Seance(movie1, new Time(10, 20));
        Seance seance2 = new Seance(movie2, new Time(12, 50));
        Seance seance3 = new Seance(movie3, new Time(14, 10));
        Seance seance4 = new Seance(movie4, new Time(16, 30));
        Seance seance5 = new Seance(movie5, new Time(18, 15));
        Seance seance6 = new Seance(movie6, new Time(20, 40));
        Seance seance7 = new Seance(movie7, new Time(23, 0));

        Scedule sceduleMon = new Scedule(new TreeSet<>(Arrays.asList(seance1, seance3, seance7)));
        Scedule sceduleTue = new Scedule(new TreeSet<>(Arrays.asList(seance2, seance4, seance3)));
        Scedule sceduleWed = new Scedule(new TreeSet<>(Arrays.asList(seance5, seance6, seance1)));
        Scedule sceduleThu = new Scedule(new TreeSet<>(Arrays.asList(seance2, seance7, seance4)));
        Scedule sceduleFri = new Scedule(new TreeSet<>(Arrays.asList(seance6, seance3, seance5)));

        Cinema bayda = new Cinema(new TreeMap<>() {{
            put(Days.MONDAY, sceduleMon);
            put(Days.TUESDAY, sceduleTue);
            put(Days.WEDNESDAY, sceduleWed);
            put(Days.THURSDAY, sceduleThu);
            put(Days.FRIDAY, sceduleFri);
        }}, new Time(10, 0), new Time(23, 30));

        bayda.addSeances("TUESDAY", seance1, seance6);
        System.out.println(bayda);
        System.out.println("==========");
        bayda.addSeance(seance1, "FRIDAY");
        System.out.println(bayda);
        System.out.println("==========");
        bayda.removeMovie("Мизери");
        System.out.println(bayda);
        System.out.println("==========");
        bayda.removeSeance(seance1, "MONDAY");
        System.out.println(bayda);
    }
}
