package ClassWork.ClassWork12; // Пакет для работы с классами Person

import java.util.Objects; // Импортируем класс Objects для использования метода hash()

public class Person {
    int age; // Возраст
    String name; // Имя

    public int getAge() { // Метод для получения возраста
        return age;
    }

    public void setAge(int age) { // Метод для установки возраста
        this.age = age;
    }

    public String getName() { // Метод для получения имени
        return name;
    }

    public void setName(String name) { // Метод для установки имени
        this.name = name;
    }

    @Override
    public String toString() { // Переопределение метода toString для получения строкового представления объекта
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }

    @Override
    public boolean equals(Object o) { // Переопределение метода equals для сравнения объектов
        if (this == o) return true; // Если ссылки на один и тот же объект
        if (o == null || this.getClass() != o.getClass()) return false; // Если объект null или классы не совпадают
        Person person = (Person) o; // Преобразуем объект o в тип Person
        return this.age == person.age && Objects.equals(this.name, person.name); // Сравниваем возраст и имя
    }

    @Override
    public int hashCode() { // Переопределение метода hashCode для уникальности объекта
        return Objects.hash(age, name);
    }
}
