package homework2.task1;

public class Main {

    public static void main(String[] args) {
        WildAnimals wildanimal = new WildAnimals("bear", 15,"forest", 15);
        HomeAnimals homeanimal = new HomeAnimals("perrot", 1, "simple", "kesha");
        Cat cat = new Cat("vasya", 2, "simple", "vaska", "black");
        Dog dog = new Dog("barsik", 5,"unkonown", "friend", true );
        Fox fox = new Fox("lysa", 10, "forest", 5, "orange");

        Animals [] animals = new Animals[5];
        animals[0] = wildanimal;
        animals[1] = homeanimal;
        animals[2] = cat;
        animals[3] = dog;
        animals[4] = fox;


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fox);


    }
}
