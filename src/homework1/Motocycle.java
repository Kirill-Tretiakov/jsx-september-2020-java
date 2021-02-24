package homework1;

public class Motocycle {
    private String name;
    private int age;
    private Engine engine;
    private String color;

    public Motocycle(String name, int age, Engine engine, String color) {
        this.name = name;
        this.age = age;
        this.engine = engine;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Мотоцикл {" +
                " Модель= '" + name + '\'' +
                ", Рік випуску= " + age +
                ", Двигун= " + engine +
                ", Колір= '" + color + '\'' +
                '}';
    }
}
