package Works.HomeWork.HomeWork19.store;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class AnimalStore {

    private static Map<String, Animal> animals = new HashMap<>();

    public static synchronized Map<String, Animal> getAnimals() {
        return new HashMap<>(animals);
    }

    public static synchronized void addAnimal(Animal animal) {
        animals.put(animal.getName(), animal);
        persist();
    }

    public static synchronized void initStore() {
        Path filePath = Paths.get("animals.json");
        ObjectMapper objectMapper = new ObjectMapper();

        if (!Files.exists(filePath)) {
            try {
                Files.createFile(filePath);
                Files.write(filePath, "{}".getBytes());
                System.out.println("Файл animals.json создан");
            } catch (IOException e) {
                System.err.println("Ошибка при создании файла " + e.getMessage());
                return;
            }

        }

        try {
            byte[] bytes = Files.readAllBytes(filePath);
            if (bytes.length > 0) {
                animals = objectMapper.readValue(bytes, objectMapper.getTypeFactory().constructMapType(HashMap.class, String.class, Animal.class));
                System.out.println("Данные успешно загружены из файла " + filePath.toAbsolutePath());
            } else {
                System.out.println("Файл пустой");
                animals = new HashMap<>();
            }
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке  " + e.getMessage());
            animals = new HashMap<>();
        }
    }

    public static void main(String[] args){
        AnimalStore.initStore();
        Animal dog = new Animal("Cat ", "Barsik");
        AnimalStore.addAnimal(dog);
        AnimalStore.persist();
    }

    public static synchronized void persist() {
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("animals.json");
        try {
            String content = objectMapper.writeValueAsString(animals);
            Files.write(filePath, content.getBytes());
            System.out.println("Инфа сохранилась" + filePath.toAbsolutePath());
        } catch (JsonProcessingException e) {
            System.err.println("Не поменялись данные вы джис " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при записи " + e.getMessage());
        }
    }
}