package Works.ClassWork.ClassWork14.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsDemo2 {
    public static void main(String... args) { // главная точка входа программы
        // Создаем HashMap для хранения объектов, которые реализуют интерфейс Outable
        Map<String, Outable> actions = new HashMap<>(); // создает новую HashMap для хранения различных действий

        actions.put("loud", new LoudOutable()); // Добавление объекта LoudOutable в actions с ключом "loud"
        actions.put("silent", new SilentOutable()); // Добавление объекта SilentOutable в actions с ключом "silent"
        actions.put("standart", new StandartOutable()); // Добавление объекта StandartOutable в actions с ключом "standart"

        String myString = "differentLetters"; // Строка для обработки

        // Создаем объект Scanner для ввода с клавиатуры
        Scanner s = new Scanner(System.in); // создает новый Scanner для обработки ввода пользователя

        // Вводим действие
        String action = s.next(); // Получаем строку с клавиатуры, представляющую действие

        // Проверяем, существует ли такое действие в нашей HashMap
        if (actions.containsKey(action)) { // проверка наличия ключа в HashMap
            actions.get(action).out(myString); // Если ключ найден, вызывает метод out для объекта, связанного с ключом
        } else {
            System.out.println("No such action"); // Если ключ не найден, выводим сообщение об ошибке
        }
    }
}
