package homework8;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

        public static void main(String[] args) {
            User user1 = new User(1, "Kirill", 19, Gender.FEMALE);
            User user2 = new User(2, "Alex", 50, Gender.MALE);
            User user3 = new User(3, "Lera", 17, Gender.FEMALE);
            User user4 = new User(4, "Alina", 12, Gender.MALE);
            User user5 = new User(5, "Marina", 50, Gender.FEMALE);
            User user6 = new User(6, "Vova", 42, Gender.MALE);
            User user7 = new User(7, "Dasha", 18, Gender.FEMALE);
            User user8 = new User(8, "Nastya", 28, Gender.FEMALE);
            User user9 = new User(9, "Roma", 25, Gender.MALE);
            User user10 = new User(10, "Veronika", 4, Gender.FEMALE);

            ArrayList<User> users = new ArrayList<>();
            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);
            users.add(user5);
            users.add(user6);
            users.add(user7);
            users.add(user8);
            users.add(user9);
            users.add(user10);

            Stream<User> stream = users.stream();

            stream.filter(user -> user.getGender().equals(Gender.FEMALE)).forEach(System.out::println);
        }
    }

