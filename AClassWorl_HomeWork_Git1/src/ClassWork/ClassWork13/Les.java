package ClassWork.ClassWork13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Класс для демонстрации работы с ArrayList и его методов
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
            List<Integer> l = new LinkedList<>();
            l.add(2); // Добавляем элемент 2 в список
            l.add(3); // Добавляем элемент 3 в список
            l.add(4); // Добавляем элемент 4 в список

            // Создаем второй ArrayList и добавляем элементы
            List<Integer> l1 = new ArrayList<>();
            l1.add(15); // Добавляем элемент 15 в список
            l1.add(16); // Добавляем элемент 16 в список

            // Печатаем начальный список
            printList(l); // Вызываем метод для печати текущего списка

            // Удаляем элемент "2" с помощью итератора
            Iterator<Integer> i = l.iterator();
            while (i.hasNext()) {
                int t = i.next(); // Получаем следующий элемент из списка
                if (t == 2) { // Проверяем, является ли текущий элемент числом 2
                    i.remove(); // Удаляем элемент из списка
                }
            }
            System.out.println("After removing element 2:"); // Переводим вывод на английский
            printList(l); // Печатаем обновленный список

            // Добавляем новые элементы в список
            l.add(2, 3); // Добавляем число 3 на позицию с индексом 2 в список
            l.add(6);    // Добавляем число 6 в конец списка
            System.out.println("After adding two elements:"); // Переводим вывод на английский
            printList(l); // Печатаем обновленный список

            // Добавляем в список все элементы из другого списка
            l.addAll(l1);
            System.out.println("After adding elements from another list:"); // Переводим вывод на английский
            printList(l); // Печатаем обновленный список

            // Удаляем элемент по индексу
            l.remove(1); // Удаляем элемент на позиции 1
            System.out.println("After removing element at index 1:"); // Переводим вывод на английский
            printList(l); // Печатаем обновленный список

            // Выполняем проверки
            System.out.println("Does list contain element 4: " + l.contains(4)); // Переводим вывод на английский
            System.out.println("Index of element 4: " + l.indexOf(4)); // Переводим вывод на английский
            System.out.println("Index of element 19: " + l.indexOf(19)); // Переводим вывод на английский
            System.out.println("Is list empty: " + l.isEmpty()); // Переводим вывод на английский
            System.out.println("Element at index 4: " + l.get(4)); // Переводим вывод на английский

            // Очищаем список
            l.clear();
            System.out.println("After clearing the list:"); // Переводим вывод на английский
            printList(l); // Печатаем обновленный список
        }
    }

    // Метод для печати элементов списка
    private static void printList(List<Integer> l) {
        System.out.println("Current list (size " + l.size() + "):"); // Переводим вывод на английский
        Iterator<Integer> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()); // Получаем элемент и печатаем его
        }
        System.out.println("--------------------------------------------------------");
    }

    // Set
    // TreeSet
    // HashSet

    public static void handleSetOperations(String... args) {
        Set<Integer> s = new TreeSet<>();
        s.add(2);
        s.add(3);
        s.add(5);
        printIterable(s);

        System.out.println("set contains 3: " + s.contains(3)); // Переводим вывод на английский
        System.out.println("set size: " + s.size()); // Переводим вывод на английский
        System.out.println("removing existing element: " + s.remove(3)); // Переводим вывод на английский
        System.out.println("removing nonexisting element: " + s.remove(3)); // Переводим вывод на английский
        System.out.println("is empty: " + s.isEmpty()); // Переводим вывод на английский
        List<Integer> l = new ArrayList<>();
        l.add(18);
        l.add(19);
        System.out.println("adding additional collection 18,19: " + s.addAll(l)); // Переводим вывод на английский
        printIterable(s);
        System.out.println("contains all 18,19: " + s.containsAll(l)); // Переводим вывод на английский
    }

    private static void printIterable(Iterable<Integer> l) {
        System.out.println("CurrentIterable: " + l.getClass()); // Переводим вывод на английский
        Iterator<Integer> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
