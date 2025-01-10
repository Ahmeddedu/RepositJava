package Works.HomeWork.HomeWork17;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

// Я сделал загрузку в файл чтобы сохранилось я это подсмотрел у одного ютубера , но как сделать удаление незнаю и по этому после команды сейф сохзраняються имена и возраст в персонс
public class HW {
    private static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        loadPersons();// это загрузка из джисон файла персон я хз как по другому можно сделать

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выбрите действие add, remove, list, find, save");// я добвил сейф чтобы сохранять в джисон файл
            String action = scanner.nextLine();

            switch (action) {
                case "add":
                    addPerson(scanner);
                    break;
                case "remove":
                    removePerson(scanner);
                    break;
                case "list":
                    listPersons();
                    break;
                case "find":
                    findPerson(scanner);
                    break;
                case "save":
                    savePersons();
                    break;
            }
        }
    }

    private static void addPerson(Scanner scanner) {
        System.out.print("ведите имя ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст ");
        int age = Integer.parseInt(scanner.nextLine());
        persons.add(new Person(name, age));
    }

    private static void removePerson(Scanner scanner) {
        System.out.print("Введите имя для удаления ");
        String name = scanner.nextLine();

        for (Person person : persons) {
            if (person.getName().equals(name)) {
                persons.remove(person);
                break;
            }
        }
    }

    private static void listPersons() {
        if (persons.isEmpty()) {
            System.out.println("Нет людей");
        } else {
            for (Person person : persons) {
                System.out.println(person.getName() + person.getAge());
            }
        }
    }

    private static void findPerson(Scanner scanner) {
        System.out.print("Введите имя кого хотит ");
        String name = scanner.nextLine();

        for (Person person : persons) {
            if (person.getName().equals(name)) {
                System.out.println(person.getName() +  person.getAge());
                return;
            }
        }

        System.out.println("Человек не найден");
    }
    //тут сохранение в файл и выгрузка из файла я не знаю как по другому сделать

    //я зделал чтобы была загрузка в файл
    private static void savePersons() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("persons.json"), persons);
        System.out.println("Данные сохранены в файл persons.json.");
    }

    //ето загрузка из файла или как назвать
    private static void loadPersons() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("persons.json");


    }

}
