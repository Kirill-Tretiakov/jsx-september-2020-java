package homework1;

public class Car {
    private String name;
    private  int age;
    private  Engine engine;
    private String color;

    public Car(String name, int age, Engine engine, String color){
        this.name = name;
        this.age = age;
        this.engine = engine;
        this.color = color;
    }

    public Car(String name, int age, String color,double volume, int horsepower,String type){
        this.name = name;
        this.age = age;
        this.color = color;
        this.engine =  new Engine(1.5, 205, "sport");
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return  age;
    }

    public  Engine getEngine(){
        return  engine;
    }

    public  String getColor(){
        return  color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void setAge(int age){
        this.age = age;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public  void  setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return " Машина {" +
                " Назва ='" + name + '\'' +
                ", Рік випуску =" + age +
                ", Двигун =" + engine +
                ", Колір ='" + color + '\'' +
                '}';
    }
}
