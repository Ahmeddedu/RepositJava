package Works.HomeWork.HomeWork12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HWT {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім’я файлу: ");
        String fileName = scanner.nextLine() + ".txt";

        try (PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {

            for (int i = 0; i < 5; i++) {
                System.out.print("Тварина " + (i + 1) + ": ");// тут я сделал прикольно прогон масива и что каждый раз + 1 число ( удолбно )
                String animal = scanner.nextLine();
                writer.println(animal);
            }
            System.out.println("Масив записано в файл " + fileName );
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException("Ошибка , ты ошибся занчит ты чот не смог ", e);
        } finally {
            scanner.close();
        }
    }
}
