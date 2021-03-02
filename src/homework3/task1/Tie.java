package homework3.task1;

public class Tie extends Clothes implements ManClothes {
    private String name;

    public Tie(int cost, String color, ClothesSize size, String name) {
        super(cost, color, size);
        this.name = name;
    }

    @Override
    public String dresMan() {
        return "Man wears Pie";
    }

    @Override
    public String toString() {
        return "Tie{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
