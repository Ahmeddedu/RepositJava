package Works.HomeWork.HomeWork19.store;

import java.util.HashMap;
import java.util.Map;

public class AnimalStore {

    private static Map<String, Animal> animals = new HashMap<>();//мапы я сам недавно изучил просто в ютубе смотрел как можно сохранять данные и способ удобный

    public static synchronized Map<String, Animal> getAnimals() {
        return new HashMap<>(animals);
    }

    public static synchronized void addAnimal(Animal animal) {
        animals.put(animal.getName(), animal);
    }
}

