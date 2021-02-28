package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Artem", 22, "suite", false, true, "Java Dev");
        Woman woman = new Woman("Angela", 19, 3);

        System.out.println(man);
        System.out.println(man.whatDressToDay());
        System.out.println(woman);
        System.out.println(woman.whichSize());

    }
}
