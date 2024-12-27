package Works.ClassWork.ClassWork14.Maps;

/*
 * Класс LoudOutable реализует интерфейс Outable и
 * переопределяет метод out для вывода строки в верхнем регистре.
 */

public class LoudOutable implements Outable {

    @Override
    public void out(String s) { // Переопределенный метод out для вывода строки в верхнем регистре
        System.out.println(s.toUpperCase()); // Преобразует строку в верхний регистр и выводит на консоль
    }
}
