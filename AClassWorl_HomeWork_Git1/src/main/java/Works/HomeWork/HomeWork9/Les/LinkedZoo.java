package Works.HomeWork.HomeWork9.Les;

public class LinkedZoo implements Zoo {

    private Flat first;

    @Override
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

    private Flat getLast() {
        Flat f = this.first;

        while (f.getNextFlat() != null) {
            f = f.getNextFlat();
        }
        return f;
    }

    @Override
    public void makeNoise() {
        if (this.first == null) {
            return;
        }

        Flat f = this.first;
        while (f != null) {
            f.getAnimal().makeSound();
            f = f.getNextFlat();
        }
    }

    @Override
    public void makeNoise(int i) {
        if (this.first == null) {
            return;
        }

        Flat f = this.first;
        int index = 0;

        while (f != null) {
            if (index == i) {
                f.getAnimal().makeSound();
                f.getAnimal().makeSound();
            } else {
                f.getAnimal().makeSound();
            }
            f = f.getNextFlat();
            index+=1;
        }
    }

    @Override
    public void makeAnimalFree(int i) {
    }

    public void makeLastAnimalFree() {
        if (this.first == null || this.first.getNextFlat() == null) {
            this.first = null;
            return;
        }

        Flat f = this.first;

        while (f.getNextFlat().getNextFlat() != null) {
            f = f.getNextFlat();
        }

        f.setNextFlat(null);
    }

    public boolean addAnimalOld(Animal a) {
        if (first == null) {
            first = new Flat();
            first.setAnimal(a);
            return true;
        }

        if (first.getNextFlat() == null) {
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
