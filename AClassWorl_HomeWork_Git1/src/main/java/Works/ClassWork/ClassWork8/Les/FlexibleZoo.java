package Works.ClassWork.ClassWork8.Les;

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

    @Override
    public void makeNoise() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    @Override
    public void makeAnimalFree(int i) {

    }
}
