package homework2.task1;

public class WildAnimals extends Animals {
    private String place;
    private  int levelOfAgressive;

    public WildAnimals(String name, int age, String place, int levelOfAgressive) {
        super(name, age);
        this.place = place;
        this.levelOfAgressive = levelOfAgressive;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getLevelOfAgressive() {
        return levelOfAgressive;
    }

    public void setLevelOfAgressive(int levelOfAgressive) {
        this.levelOfAgressive = levelOfAgressive;
    }

    @Override
    public String toString() {
        return "WildAnimals{" +
                "place='" + place + '\'' +
                ", levelOfAgressive=" + levelOfAgressive +
                "} " + super.toString();
    }
}
