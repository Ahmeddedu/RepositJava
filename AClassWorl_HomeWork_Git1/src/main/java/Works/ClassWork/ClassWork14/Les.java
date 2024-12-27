package Works.ClassWork.ClassWork14;

import java.util.Map;
import java.util.HashMap;

public class Les {
    // Основные термины:
    // - Map: Интерфейс коллекции для хранения пар "ключ-значение".
    // - HashMap: Класс реализации интерфейса Map для создания карты.
    // - Person: Класс объектов, используемых как значения в карте.

    public static void main(String... args) {
        Map<String, Person> map = new HashMap<>(); // Создание HashMap для хранения объектов Person с ключами String

        Person p1 = new Person("Taras"); // Создание объекта Person для Taras
        Person p2 = new Person("Lexa"); // Создание объекта Person для Lexa

        map.put("Taras", p1); // Добавление объекта Taras в map
        map.put("Lexa", p2); // Добавление объекта Lexa в map

        System.out.println("size:" + map.size()); // Печать размера карты
        System.out.println("taras:" + map.get("Taras")); // Получение объекта по ключу Taras
        System.out.println("bohdan:" + map.get("Bohdan")); // null, нет такого ключа
        System.out.println("contains bohdan:" + map.containsKey("Bohdan")); // false, нет такого ключа
        System.out.println("contains neBohdan:" + map.containsKey("neBohdan")); // false, нет такого ключа
        System.out.println("contains value p1:" + map.containsValue(p1)); // false, значение p1 отсутствует в map
        System.out.println("contains remove Bohdan:" + map.remove("Bohdan")); // null, нет такого ключа для удаления
        System.out.println("contains bohdan:" + map.containsKey("Bohdan")); // false, ключ Bohdan не существует

        map.put("Bohdan", p2); // Добавление объекта Bohdan в map

        for (Person t : map.values()) { // Перебор значений в map
            System.out.println("values:" + t); // Печать значений
        }

        for (String t : map.keySet()) { // Перебор ключей в map
            System.out.println("key: " + t + " value:" + map.get(t)); // Печать ключей и значений
        }

        for (Map.Entry<String, Person> t : map.entrySet()) { // Перебор пар ключ-значение
            System.out.println("entry : k:" + t.getKey() + " v:" + t.getValue()); // Печать пар
        }
    }
}
