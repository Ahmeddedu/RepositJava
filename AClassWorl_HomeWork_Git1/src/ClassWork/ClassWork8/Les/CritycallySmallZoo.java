package ClassWork.ClassWork8.Les;

public class CritycallySmallZoo implements Zoo {

    Animal animal;

    @Override
    public boolean addAnimal(Animal animal) {
        if (this.animal == null) {
            this.animal = animal;
            return true;
        }
        return false;
    }

    @Override
    public void makeNoise() {
        this.animal.makeSound();
    }

    @Override
    public void makeAnimalFree(int i) {

    }
}
