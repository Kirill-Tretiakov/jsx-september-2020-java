package homework2.task3;

public class Woman implements DressWoman{
    private String name;
    private int age;
    private  int sizeOfBust; // :)

    public Woman(String name, int age, int sizeOfBust) {
        this.name = name;
        this.age = age;
        this.sizeOfBust = sizeOfBust;
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

    public int getSizeOfBust() {
        return sizeOfBust;
    }

    public void setSizeOfBust(int sizeOfBust) {
        this.sizeOfBust = sizeOfBust;
    }

    @Override
    public String whatDressToDay() {
       return "I put on a luxurious dress today";
    }

    @Override
    public String whichSize() {
        return whatDressToDay() + " , Size s";
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sizeOfBust=" + sizeOfBust +
                '}';
    }
}
