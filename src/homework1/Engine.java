package homework1;

public class Engine {
    private  double volume;
    private  int horsepower;
    private  String type;

    public Engine(double volume, int horsepower, String type) {
        this.volume = volume;
        this.horsepower = horsepower;
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return " Двигун {" +
                " Об'єм= " + volume +
                ", Кінські сили= " + horsepower +
                ", Тип двигуна= '" + type + '\'' +
                '}';
    }
}
