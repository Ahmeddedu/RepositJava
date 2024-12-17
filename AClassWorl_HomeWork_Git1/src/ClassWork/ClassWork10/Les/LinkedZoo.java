package ClassWork.ClassWork10.Les;

public class LinkedZoo implements Zoo {

    Flat first;

    private Flat getFlatByIndex(int number) {
        int i = 0;
        Flat f = first;
        while (i < number && f.nextFlat != null) {
            i++;
            f = f.nextFlat;
        }

        if (i == number) {
            return f;
        }
        return null;

    }

    public boolean addAnimal(Animal a) {
        if (first == null) {
            first = new Flat();
            first.setAnimal(a);
            return true;
        }
        Flat last = getLast();

        Flat newFlat = new Flat();
        newFlat.setAnimal(a);

        last.setNextFlat(newFlat);
        return true;
    }

    @Override
    public boolean addAnimal(Animal a, int number) {
        Flat f = getFlatByIndex(number - 1);
        if (f == null)
            return false;

        Flat newFlat = new Flat();
        newFlat.animal = a;
        if (f.nextFlat == null) {
            f.nextFlat = newFlat;
        } else {
            newFlat.nextFlat = f.nextFlat;
            f.nextFlat = newFlat;
        }
        return true;

    }


    private Flat getLast(){
        Flat f = this.first;

        while (f.getNextFlat() != null) {
            f = f.getNextFlat();
        }
        return  f;
    }

    @Override
    public void makeNoise() {
        if ( this.first == null){
            return;
        }
        Flat f = this.first;

        while (f.getNextFlat() != null) {
            f.getAnimal().makeSound();
            f = f.getNextFlat();
        }
        f.getAnimal().makeSound();
    }

    @Override
    public void makeAnimalFree(int number) {
        Flat f = getFlatByIndex(number - 1);
        if (f == null)
            return;

        if (f.nextFlat == null) {
            return;
        }
        f.nextFlat = f.nextFlat.nextFlat;
    }

    public boolean addAnimalOld(Animal a) {
        if (first == null) {
            first = new Flat();
            first.setAnimal(a);
            return true;
        }

        if (first.nextFlat == null) {
            Flat second = new Flat();
            second.setAnimal(a);
            first.setNextFlat(second);
            return true;
        }

        Flat third = new Flat();
        third.setAnimal(a);
        first.getNextFlat().setNextFlat(third);
        return true;
    }
}