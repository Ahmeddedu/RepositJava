package ClassWork.ClassWork12;

import java.util.Scanner;

public class Work {
    public static void main(String... args) {
        System.out.println("Input your name:");
        Scanner scanner = new Scanner(System.in); // Импорт Scanner и создание экземпляра
        String s = scanner.next();
        System.out.println("You entered: " + s);

        System.out.println("Input your name once more:");
        s = scanner.next(); // Использование уже созданного scanner
        System.out.println("You entered: " + s);

        scanner.close(); // Закрываем Scanner
    }
}
