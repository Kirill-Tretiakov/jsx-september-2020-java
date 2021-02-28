package homework2.task1;

public class Cat extends HomeAnimals {

    private  String eyesColor;

    public Cat(String name, int age, String poroda, String klikuha, String eyesColor) {
        super(name, age, poroda, klikuha);
        this.eyesColor = eyesColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyesColor='" + eyesColor + '\'' +
                "} " + super.toString();
    }
}
