package homework3.task1;

public class Dress extends Clothes implements WomanClothes {
    private String name;

    public Dress(int cost, String color, ClothesSize size, String name) {
        super(cost, color, size);
        this.name = name;
    }

    @Override
    public String dresWoman() {
        return "Woman wears Dres";
    }

    @Override
    public String toString() {
        return "Dress{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
