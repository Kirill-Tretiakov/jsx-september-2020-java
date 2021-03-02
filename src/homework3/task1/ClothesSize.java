package homework3.task1;

public enum ClothesSize {
    XXS(38), XS(40), S(42), M(44), L(48), Xl(52), XXL(54);

    int euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "ClothesSize{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
