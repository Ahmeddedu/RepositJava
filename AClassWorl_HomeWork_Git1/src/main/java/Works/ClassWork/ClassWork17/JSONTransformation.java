package Works.ClassWork.ClassWork17;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JSONTransformation {
    public static void main(String[] args) throws IOException {

        // Создаем объекты типа Person
        Person person = new Person("Taras",19);
        Person f1 = new Person("Alex", 20);
        Person f2 = new Person("Bohdan", 19);

        // Создаем объект хранилища и добавляем людей
        PesonsStorage st = new PesonsStorage();
        st.getPersons().add(person);
        st.getPersons().add(f1);
        st.getPersons().add(f2);

        // Добавляем друзей для person
        person.getFriends().add(f1);
        person.getFriends().add(f2);

        // Создаем объект ObjectMapper для работы с JSON
        ObjectMapper objectMapper = new ObjectMapper();

        // Преобразуем объект person в строку JSON
        String json = objectMapper.writeValueAsString(person);

        // Преобразуем объект хранилища в строку JSON
        String storageJson = objectMapper.writeValueAsString(st);

        // Выводим строки JSON в консоль
        System.out.println(json);
        System.out.println();
        System.out.println(storageJson);

        // Раскомментировать если нужно
        // Map<String,Object> deserialized = objectMapper.readValue(json,Map.class);
        // System.out.println();

        // Десериализуем строки JSON обратно в объекты
        Person deserializedPerson = objectMapper.readValue(json, Person.class);
        PesonsStorage st1 = objectMapper.readValue(storageJson, PesonsStorage.class);

        // Выводим десериализованный объект
        System.out.println("Deserialized Object: " + deserializedPerson.getName() + ", " + deserializedPerson.getAge());
    }

    private static class ObjectMapper {
    }
}
