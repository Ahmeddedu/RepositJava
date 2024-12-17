package ClassWork.ClassWork13;

import java.util.*;

/*
 * ArrayList - эффективные операции по индексам и высокое потребление памяти
 * LinkedList - оптимальная память, но медленные операции по индексам
 */

// Класс для демонстрации работы с ArrayList
public class Les {
    public static void main(String... args) {
        if (args.length > 0) {
            handleSetOperations(args); // Проверяем, переданы ли аргументы и, если да, выполняем операции с множествами
        } else {
            // Создаем LinkedList и добавляем элементы
            List<Integer> l = new LinkedList<>(); // LinkedList - двусвязный список, подходящий для частых вставок и удалений
            l.add(2); // Добавляем элемент 2 в список
            l.add(3); // Добавляем элемент 3 в список
            l.add(4); // Добавляем элемент 4 в список

            // Создаем второй ArrayList и добавляем элементы
            List<Integer> l1 = new ArrayList<>(); // ArrayList - массив динамической длины
            l1.add(15); // Добавляем элемент 15 в список
            l1.add(16); // Добавляем элемент 16 в список

            // Печатаем начальный список
            printIterable(l); // Вызываем метод для печати текущего списка

            // Удаляем элемент "2" с помощью итератора
            Iterator<Integer> i = l.iterator(); // Получаем итератор для обхода списка
            while (i.hasNext()) {
                int t = i.next(); // Получаем следующий элемент из списка
                if (t == 2) { // Проверяем, является ли текущий элемент числом 2
                    i.remove(); // Удаляем элемент из списка
                }
            }
            System.out.println("After DELETION:");
            printIterable(l); // Печатаем обновленный список

            // Добавляем новые элементы в список
            l.add(2, 3); // Добавляем число 3 на позицию с индексом 2 в список
            l.add(6);    // Добавляем число 6 в конец списка
            System.out.println("After Adding 2 elements:");
            printIterable(l); // Печатаем обновленный список

            // Добавляем в список все элементы из другого списка
            l.addAll(l1); // Метод addAll добавляет все элементы из переданной коллекции
            System.out.println("After Adding another collection:");
            printIterable(l); // Печатаем обновленный список

            // Удаляем элемент по индексу
            l.remove(1); // Удаляем элемент на позиции 1
            System.out.println("After removing element 1:");
            printIterable(l); // Печатаем обновленный список

            // Выполняем проверки
            System.out.println("Contains 4: " + l.contains(4)); // Проверяем наличие элемента 4
            System.out.println("IndexOf 4: " + l.indexOf(4)); // Получаем индекс элемента 4
            System.out.println("IndexOf 19: " + l.indexOf(19)); // Получаем индекс элемента 19
            System.out.println("IsEmpty: " + l.isEmpty()); // Проверяем, пустой ли список
            if (!l.isEmpty()) {
                System.out.println("Element by index 4: " + l.get(4)); // Получаем элемент по индексу 4
            }

            // Очищаем список
            l.clear(); // Удаляем все элементы из списка
            System.out.println("After clearing:");
            printIterable(l); // Печатаем обновленный список
        }
    }

    // Метод для работы с множествами
    public static void handleSetOperations(String... args) {
        Set<Integer> s = new HashSet<>(); // HashSet - коллекция для хранения уникальных элементов без порядка
        s.add(5); // Добавляем элемент 5 в множество
        s.add(3); // Добавляем элемент 3 в множество
        s.add(2); // Добавляем элемент 2 в множество
        printIterable(s); // Печатаем элементы множества

        System.out.println("set contains 3: " + s.contains(3)); // Проверяем, содержится ли элемент 3 в множестве
        System.out.println("set size: " + s.size()); // Выводим размер множества
        System.out.println("removing existing element: " + s.remove(3)); // Удаляем элемент 3 из множества
        System.out.println("removing nonexisting element: " + s.remove(3)); // Пытаемся удалить несуществующий элемент
        System.out.println("isEmpty: " + s.isEmpty()); // Проверяем, пусто ли множество

        List<Integer> l = new ArrayList<>(); // Создаем ArrayList для дополнительных элементов
        l.add(18); // Добавляем элемент 18 в список
        l.add(19); // Добавляем элемент 19 в список
        System.out.println("adding additional collection 18,19: " + s.addAll(l)); // Добавляем все элементы из списка в множество
        printIterable(s); // Печатаем элементы множества
        System.out.println("contains all 18,19: " + s.containsAll(l)); // Проверяем, содержатся ли все элементы списка в множестве
    }

    // Метод для печати элементов списка
    private static void printIterable(Iterable<?> iterable) {
        System.out.println("Current Iterable: " + iterable.getClass().getSimpleName()); // Выводим тип текущей коллекции
        Iterator<?> iterator = iterable.iterator(); // Создаем итератор для обхода элементов
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Печатаем следующий элемент коллекции
        }
        System.out.println("--------------------------------------------------------"); // Разделитель для удобства чтения
    }

}