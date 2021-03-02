package homework3.task1;

public class TShirt extends Clothes implements ManClothes, WomanClothes {
    private String name;

    public TShirt(int cost, String color, ClothesSize size, String name) {
        super(cost, color, size);
        this.name = name;
    }

    @Override
    public String dresMan() {
        return "Man wears T-shirt";
    }

    @Override
    public String dresWoman() {
        return "Woman wears T-shirt";
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
