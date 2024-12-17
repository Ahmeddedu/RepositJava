package HomeWork.HomeWork8.Les;

public class CritycallySmallZoo implements Zoo {

    private Animal[] animals = new Animal[0];
    private Animal[] freedAnimals = new Animal[0];

    @Override
    public boolean addAnimal(Animal animal) {
        Animal[] tmp = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            tmp[i] = animals[i];
        }
        tmp[animals.length] = animal;
        animals = tmp;
        return true;
    }

    @Override
    public void makeNoise() {
        for (Animal animal : animals) {
            if (animal != null) {
                animal.makeSound();
            }
        }
    }

    @Override
    public void makeAnimalFree(int i) {
        if (i >= 0 && i < animals.length && animals[i] != null) {
            Animal[] tmp = new Animal[freedAnimals.length + 1];
            for (int j = 0; j < freedAnimals.length; j++) {
                tmp[j] = freedAnimals[j];
            }
            tmp[freedAnimals.length] = animals[i];
            freedAnimals = tmp;

            animals[i] = null;
            System.out.println("Животное выпущено.");
        } else {
            System.out.println("Неверный индекс.");
        }
    }
}
