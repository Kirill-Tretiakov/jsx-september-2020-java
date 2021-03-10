package homework5.task2;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Scedule {

    private Set<Seance> seanceSet;

    public Scedule(TreeSet<Seance> seances) {
        this.seanceSet = seances;
    }

    public void addSeance(Seance seance){
        seanceSet.add(seance);
    }

    public void removeSeance(Seance seance){
        seanceSet.remove(seance);
    }

    public Set<Seance> getSeanceSet() {
        return seanceSet;
    }

    public void setSeanceSet(Set<Seance> seanceSet) {
        this.seanceSet = seanceSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scedule scedule = (Scedule) o;
        return Objects.equals(seanceSet, scedule.seanceSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seanceSet);
    }

    @Override
    public String toString() {
        return "Scedule{" +
                "seanceSet=" + seanceSet +
                '}';
    }
}
