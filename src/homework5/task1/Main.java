package homework5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void printMenu() {

        System.out.println("1 Додати учасника в клуб");
        System.out.println("2 Додати тваринку до учасника клубу");
        System.out.println("3 Видалити тваринку з власника");
        System.out.println("4 Видалити учасника з клубу");
        System.out.println("5 Видалити конкретну тваринку з усіх власників");
        System.out.println("6 Вивести на екран Зооклуб");
        System.out.println("Для виходу з меню введіть 'break'");

    }

    public static void printZooPark(Zoo zoo) {
        for (Map.Entry<Person, List<Pet>> mapa : zoo.getZoopark().entrySet()) {
            System.out.println(mapa.getKey().toString() + " : " + mapa.getValue().toString());
        }
    }


    public static void main(String[] args) throws IOException {
        Map<Person, List<Pet>> zoopark = new HashMap<>();
        zoopark.put(new Person("Dasha", 29),
                new ArrayList<>(Arrays.asList(
                        new Pet(Breed.CAT, "Bazuka"),
                        new Pet(Breed.CAT, "Lolo"),
                        new Pet(Breed.HAMSTER, "Vasilij"))));
        zoopark.put(new Person("Sveta", 35),
                new ArrayList<>(Arrays.asList(
                        new Pet(Breed.CAT, "Matilda"),
                        new Pet(Breed.TURTLE, "Mudraja"))));
        zoopark.put(new Person("Valja", 50),
                new ArrayList<>(Arrays.asList(
                        new Pet(Breed.DOG, "Sharik"),
                        new Pet(Breed.PARROT, "Kesha"))));
        zoopark.put(new Person("Alina", 15),
                new ArrayList<>(Arrays.asList(
                        new Pet(Breed.HAMSTER, "Fillip"),
                        new Pet(Breed.DOG, "Chernysh"))));
        Zoo zoo = new Zoo(zoopark);

        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            printMenu();
            String choice = reader.readLine();
            switch (choice) {

                case "1":
                    System.out.println("Введіть ім'я нового учасника: ");
                    String name = reader.readLine();
                    System.out.println("Введіть вік нового учасника: ");
                    int age = 0;
                    try {
                        age = Integer.parseInt(reader.readLine());
                    } catch (Exception e) {
                        System.out.println("Данні не вірні!! Спробуйте будь ласка ще раз!");
                        break;
                    }
                    zoopark.put(new Person(name, age), new ArrayList<>());
                    System.out.println("Все добре!");
                    break;

                case "2":
                    System.out.println("Введіть ім'я власника, якому хочете присвоїти тварину: ");
                    name = reader.readLine();
                    Person pers = null;
                    for (Map.Entry<Person, List<Pet>> mapa : zoo.getZoopark().entrySet()) {
                        if (mapa.getKey().getName().equals(name)) {
                            pers = mapa.getKey();
                            System.out.println("Види тварин: " + Arrays.toString(Breed.values()));
                            System.out.println("Введіть рід тваринки: ");
                            String breed = reader.readLine();
                            Breed breed1 = null;
                            for (Breed c : Breed.values()) {
                                if (c.name().equals(breed)) {
                                    breed1 = c;
                                }
                            }
                            if (breed1 == null) {
                                System.out.println("Ви невірно ввели рід тварини! Спробуйте будь ласка ще раз!");
                                break;
                            }
                            System.out.println("Введіть ім'я тваринки: ");
                            String petName = reader.readLine();
                            mapa.getValue().add(new Pet(Breed.valueOf(breed), petName));
                            break;
                        }
                    }
                    if (pers == null) System.out.println("Немає такого учасника! Спробуйте заново!");
                    break;

                case "3":
                    System.out.println("Введіть ім'я власника, в котрого хочете видалити тваринку: ");
                    name = reader.readLine();
                    pers = null;
                    for (Map.Entry<Person, List<Pet>> mapa : zoo.getZoopark().entrySet()) {
                        if (mapa.getKey().getName().equals(name)) {
                            pers = mapa.getKey();
                            System.out.println("У цього учасника є такі тварини: " + mapa.getValue().toString());
                            System.out.println("Тварини бувають такі: " + Arrays.toString(Breed.values()));
                            System.out.println("Введіть рід тваринки, яку бажаєте видалити: ");
                            String breed = reader.readLine();
                            Breed breed1 = null;
                            for (Breed c : Breed.values()) {
                                if (c.name().equals(breed)) {
                                    breed1 = c;
                                }
                            }
                            if (breed1 == null) {
                                System.out.println("Ви невірно ввели рід! Спробуйте наново!");
                                break;
                            }
                            System.out.println("Введіть ім'я тваринки: ");
                            String petName = reader.readLine();
                            Pet pet = new Pet(breed1, petName);
                            Pet pet2 = null;
                            for (Pet pet1 : mapa.getValue()){
                                if (pet1.equals(pet)) {
                                    pet2 = pet;
                                    break;
                                }
                            }
                            if (pet2 == null){
                                System.out.println("Немає тваринки з таким родом та ім'ям! Спробуйте наново!");
                                break;
                            }
                            mapa.getValue().remove(pet2);
                            System.out.println(mapa);
                            System.out.println("Успішно!");
                            break;
                        }
                    }
                    if (pers == null) System.out.println("Немає такого учасника! Спробуйте наново!");
                    break;

                case "4":
                    System.out.println("Введіть ім'я власника, котрого хочете видалити: ");
                    name = reader.readLine();
                    pers = null;
                    for (Map.Entry<Person, List<Pet>> mapa : zoo.getZoopark().entrySet()) {
                        if (mapa.getKey().getName().equals(name)) {
                            pers = mapa.getKey();
                            zoo.getZoopark().remove(pers);
                            printZooPark(zoo);
                            System.out.println("Успішно!");
                            break;
                        }
                    }
                    if (pers == null) System.out.println("Немає такого учасника! Спробуйте наново!");
                    break;

                case "5":
                    System.out.println("Тварини бувають такі: " + Arrays.toString(Breed.values()));
                    System.out.println("Введіть рід тваринки, яку бажаєте видалити з усіх власників:");
                    String breed = reader.readLine();
                    Breed breed1 = null;
                    for (Breed c : Breed.values()) {
                        if (c.name().equals(breed)) {
                            breed1 = c;
                        }
                    }
                    if (breed1 == null) {
                        System.out.println("Ви невірно ввели рід тваринки! Спробуйте наново!");
                        break;
                    }

                    for (Map.Entry<Person, List<Pet>> mapa : zoo.getZoopark().entrySet()) {
                        for(int a = 0; a < mapa.getValue().size(); a++){
                            if (mapa.getValue().get(a).getBreed() == breed1){
                                mapa.getValue().remove(a);
                                a--;
                            }
                        }
                    }
                    printZooPark(zoo);
                    System.out.println("Успішно!");
                    break;

                case "6":
                    printZooPark(zoo);
                    System.out.println("Успішно!");
                    break;

                case "break":
                    flag = false;
                    break;

                default:
                    System.out.println("Оберіть пункт з меню від 1 до 6 або введіть 'break'!");
                    break;
            }
        }
    }
}
