package homework3.task1;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    private String name;

    public Pants(int cost, String color, ClothesSize size, String name) {
        super(cost, color, size);
        this.name = name;
    }

    @Override
    public String dresMan() {
        return "Man wears Panths";
    }

    @Override
    public String dresWoman() {
        return "Woman wears Pants";
    }

    @Override
    public String toString() {
        return "Pants{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
