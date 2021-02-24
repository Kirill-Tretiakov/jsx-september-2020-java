package homework1;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(1.5, 88, "standart");
        Engine engine1 = new Engine(1.2, 120, "turbo");
        Car car = new Car("mers", 2005, new Engine(6.3, 500, "gt"), "black");
        Car car1 = new Car("lanos", 2004, engine1, "green");
        Car car2 = new Car("bmw", 2012, "blue", 1.2, 300, "standart");
        Motocycle motocycle = new Motocycle("yamaha", 2012, engine1, "white");

        System.out.println(engine);
        System.out.println(engine1);
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(motocycle);


    }
}
