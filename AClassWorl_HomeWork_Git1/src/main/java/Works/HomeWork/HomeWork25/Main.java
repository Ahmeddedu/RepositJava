package Works.HomeWork.HomeWork25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите имя ");
        String firstName = scanner.nextLine();

        System.out.print("Ведите фамил");
        String lastName = scanner.nextLine();

        System.out.print("Придумай кто ты");
        String status = scanner.nextLine();

        Person person = new Person(firstName, lastName);
        Person titledPerson = new TitledPerson(person, status);
        Person multiLinePerson = new MultiLinePerson(titledPerson);

        multiLinePerson.printMe();
    }
}