package homework3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        User user1 = new User(1, "Kirill", Gender.MALE, 19);
        User user2 = new User(2, "Lera", Gender.FEMALE, 17);
        User user3 = new User(3, "Artem", Gender.MALE, 18);
        User user4 = new User(4, "Liza", Gender.FEMALE, 17);
        User user5 = new User(5, "Marina", Gender.MALE, 36);
        User user6 = new User(6, "Rostic", Gender.OTHER, 38);
        User user7 = new User(7, "Vova", Gender.MALE, 43);
        User user8 = new User(8, "Alex", Gender.MALE, 49);
        User user9 = new User(9, "Marina", Gender.FEMALE, 50);
        User user10 = new User(10, "Maks", Gender.MALE, 19);


        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);


        for (User user : list) {
            if (user.getId() % 2 == 0) System.out.println(user);
        }
        System.out.println("------------");
        for (User user : list) {
            if (user.getName().length() > 5) System.out.println(user);
        }
        System.out.println("------------");
        for (User user : list) {
            if (user.getGender().equals(Gender.FEMALE)) System.out.println(user);
        }
    }


}
