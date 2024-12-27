package Works.ClassWork.ClassWork10.Les;

public class CritycallySmallZoo implements Zoo {

    Animal animal;

    @Override
    public boolean addAnimal(Animal animal) {
        if (this.animal == null) {
            this.animal = animal;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean addAnimal(Animal a, int number) {
        if (number > 0) {
            return false;
        }
        else{
            this.animal = a;
            return true;
        }
    }

    @Override
    public void makeNoise() {
        if (this.animal != null) {
            this.animal.makeSound();
        }
    }

    @Override
    public void makeAnimalFree(int i) {
        if (i == 0) {
            this.animal = null;
            System.out.println("Животное выпущено.");
        } else {
            System.out.println("Животное не найдено.");
        }
    }
}
