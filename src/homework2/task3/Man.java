package homework2.task3;

public class Man implements DressMan {
    private  String name;
    private  int age;
    private String styleOfClothes;
    private boolean wife;
    private boolean gamer;
    private  String typeOfDeveloper;

    public Man(String name, int age, String styleOfClothes, boolean wife, boolean gamer, String typeOfDeveloper) {
        this.name = name;
        this.age = age;
        this.styleOfClothes = styleOfClothes;
        this.wife = wife;
        this.gamer = gamer;
        this.typeOfDeveloper = typeOfDeveloper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStyleOfClothes() {
        return styleOfClothes;
    }

    public void setStyleOfClothes(String styleOfClothes) {
        this.styleOfClothes = styleOfClothes;
    }

    public boolean isWife() {
        return wife;
    }

    public void setWife(boolean wife) {
        this.wife = wife;
    }

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }

    public String getTypeOfDeveloper() {
        return typeOfDeveloper;
    }

    public void setTypeOfDeveloper(String typeOfDeveloper) {
        this.typeOfDeveloper = typeOfDeveloper;
    }

    @Override
    public String whatDressToDay() {
        return "Today I dress on a formal suit";
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", styleOfClothes='" + styleOfClothes + '\'' +
                ", wife=" + wife +
                ", gamer=" + gamer +
                ", typeOfDeveloper='" + typeOfDeveloper + '\'' +
                '}';
    }
}
