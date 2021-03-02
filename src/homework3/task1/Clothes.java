package homework3.task1;

public abstract class Clothes {
    private int cost;
    private String color;
    private ClothesSize size;

    public Clothes(int cost, String color, ClothesSize size) {
        this.cost = cost;
        this.color = color;
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
