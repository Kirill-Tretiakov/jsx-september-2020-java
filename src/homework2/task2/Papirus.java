package homework2.task2;

public class Papirus {
    private  String type;
    private int quality;

    public Papirus(String type, int quality) {
        this.type = type;
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "type='" + type + '\'' +
                ", quality=" + quality +
                '}';
    }
}
