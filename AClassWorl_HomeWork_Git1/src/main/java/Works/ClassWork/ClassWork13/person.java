package Works.ClassWork.ClassWork13;

import java.util.Objects;

/*
 * Хэш-код (hashCode) — это целое число, возвращаемое методом hashCode(),
 * которое используется для быстрой идентификации объекта в коллекциях,
 * таких как HashSet, HashMap. Хэш-код помогает распределять объекты
 * равномерно по ячейкам в хэш-таблице, основываясь на их данных.
 */

// Класс person для работы с объектами, сравнения и хранения данных
public class person implements Comparable<person> {

    // Поля класса: имя (name) и возраст (age)
    private String name; // Имя пользователя
    private Integer age; // Возраст пользователя

    // Конструктор, инициализирующий имя
    public person(String n) {
        name = n; // Присваиваем значение имени
    }

    // Метод equals: сравнение объектов по полям name и age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если ссылки совпадают, объекты равны
        if (o == null || getClass() != o.getClass()) return false; // Если другой объект null или типы разные, объекты не равны
        person person = (Works.ClassWork.ClassWork13.person) o; // Приведение объекта для сравнения
        return age == person.age && Objects.equals(name, person.name); // Сравнение по age и name
    }

    // Метод hashCode: вычисление хэш-кода на основе полей name и age
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Генерация хэша
    }

    // Геттер для имени
    public String getName() {
        return name; // Возвращаем имя
    }

    // Метод toString: возвращает строковое представление объекта
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}'; // Форматированный вывод
    }

    // Метод compareTo: сравнение объектов по имени
    @Override
    public int compareTo(person o) {
        if (o == null) {
            return 1; // Если другой объект null, текущий объект считается больше
        }
        return name.compareTo(o.name); // Сравнение имен по алфавиту
    }
}
