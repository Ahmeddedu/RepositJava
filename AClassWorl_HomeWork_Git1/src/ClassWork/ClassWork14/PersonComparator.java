package ClassWork.ClassWork14;

import ClassWork.ClassWork13.person;

import java.util.Comparator;

/*
 * Класс PersonComparator используется для сравнения объектов типа person.
 * Реализует интерфейс Comparator для определения пользовательского порядка сортировки.
 */

public class PersonComparator implements Comparator<ClassWork.ClassWork13.person> {

    // Переопределение метода compare для сравнения двух объектов person по имени
    @Override
    public int compare(ClassWork.ClassWork13.person o1, person o2) {
        return o1.getName().compareTo(o2.getName()); // Сравнение строковых имен в алфавитном порядке
    }
}