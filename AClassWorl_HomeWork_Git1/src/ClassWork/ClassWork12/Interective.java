package ClassWork.ClassWork12;

import java.util.Scanner;

public class Interective {
    public static void main(String... args) { // Главная точка входа в программу
        System.out.println("Input your name:"); // Печатаем сообщение, чтобы попросить пользователя ввести своё имя
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания пользовательского ввода
        String s = scanner.next(); // Считываем строку из консоли и сохраняем её в переменной 's'
        System.out.println("You entered: " + s); // Печатаем сообщение с введённым значением

        System.out.println("Input your name once more:"); // Печатаем сообщение, чтобы попросить пользователя ввести своё имя ещё раз
        s = scanner.next(); // Считываем новую строку из консоли и сохраняем её в той же переменной 's'
        System.out.println("You entered: " + s); // Печатаем сообщение с вновь введённым значением

        scanner.close(); // Закрываем Scanner, чтобы освободить ресурсы
        //sdasdasd

    }

}