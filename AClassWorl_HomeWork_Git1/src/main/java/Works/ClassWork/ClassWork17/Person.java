package Works.ClassWork.ClassWork17;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name; // Имя человека
    Integer age; // Возраст человека
    List<Person> friends = new ArrayList<>(); // Список друзей

    public List<Person> getFriends() {
        return friends; // Получить список друзей
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends; // Установить новый список друзей
    }

    public Person() {
    } // Конструктор по умолчанию

    public Person(String name, Integer age) {
        this.name = name; // Инициализация имени
        this.age = age;   // Инициализация возраста
    }

    public Integer getAge() {
        return age; // Получить возраст
    }

    public void setAge(Integer age) {
        this.age = age; // Установить новый возраст
    }

    public String getName() {
        return name; // Получить имя
    }

    public void setName(String name) {
        this.name = name; // Установить новое имя
    }
}
