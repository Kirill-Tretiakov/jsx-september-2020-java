package homework2.task2;

public class Main {
    public static void main(String[] args) {
        Papirus papirus = new Papirus("wood", 5);
        Book book = new Book("wood", 10, 150,1998,"Djon London");
        Magazine magazine = new Magazine("palma", 8,30,2021, "Pravda",
                "Pyst govoryat");
        Comiks comiks = new Comiks("palma", 12, 72, 2020, "Unknown",
                "super");

        System.out.println(papirus);
        System.out.println(book);
        System.out.println(magazine);
        System.out.println(comiks);
    }
}
