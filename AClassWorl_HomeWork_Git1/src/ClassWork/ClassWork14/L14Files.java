package ClassWork.ClassWork14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L14Files {

    public static void main(String... args) {
        File myobj = new File("output.txt"); // создание объекта File для чтения из "output.txt"
        Scanner r = null; // инициализация Scanner как null для проверки в блоке try
        try {
            r = new Scanner(myobj); // создание объекта Scanner для чтения из файла
            while (r.hasNextLine()) { // цикл, пока есть строки для чтения
                String d = r.nextLine(); // считываем следующую строку
                System.out.println(d); // выводим строку на консоль
            }
            r.close(); // закрываем объект Scanner после окончания чтения
        } catch (FileNotFoundException e) {
            System.out.println("ups file not found"); // выводим сообщение, если файл не найден
        }
    }
}
