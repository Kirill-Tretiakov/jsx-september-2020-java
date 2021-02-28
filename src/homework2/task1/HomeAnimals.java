package homework2.task1;

public class HomeAnimals extends  Animals {
    private String poroda;
    private  String klikuha;

    public HomeAnimals(String name, int age, String poroda, String klikuha) {
        super(name, age);
        this.poroda = poroda;
        this.klikuha = klikuha;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getKlikuha() {
        return klikuha;
    }

    public void setKlikuha(String klikuha) {
        this.klikuha = klikuha;
    }

    @Override
    public String toString() {
        return "HomeAnimals{" +
                "poroda='" + poroda + '\'' +
                ", klikuha='" + klikuha + '\'' +
                "} " + super.toString();
    }
}
