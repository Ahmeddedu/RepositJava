// большую часть методов уже делал похожие просто подогнал под код надеюсь правильно то не до конца понял саму суть джисон и были еще ошибки с классной роботой но я просто зщакоментил
package Works.HomeWork.HomeWork17;

import java.io.*;
import java.util.*;

public class HW {
    private static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выбрите действие add, remove, list, find");
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
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}

