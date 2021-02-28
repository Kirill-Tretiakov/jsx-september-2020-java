package homework2.task1;

public class Fox extends  WildAnimals {
    private  String color;

    public Fox(String name, int age, String place, int levelOfAgressive, String color) {
        super(name, age, place, levelOfAgressive);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
