package Works.ClassWork.ClassWork10.Les;

public class FlexibleZoo implements Zoo {

    private Animal[] animals;

    @Override
    public boolean addAnimal(Animal a) {
        if (animals == null) {
            animals = new Animal[1];
            animals[0] = a;
            return true;
        }

        Animal[] tmp = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i += 1) {
            tmp[i] = animals[i];
        }
        tmp[animals.length] = a;
        animals = tmp;
        return true;
    }

    //TODO : imple,emts me
    @Override
    public boolean addAnimal(Animal a, int number) {
        return false;
    }

    @Override
    public void makeNoise() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    @Override
    public void makeAnimalFree(int i) {
        if (i >= 0 || i < animals.length) {
            animals[i] = null;
            System.out.println("Животное выпущено.");
        } else {
            System.out.println("Неверный индекс.");
        }
    }
}