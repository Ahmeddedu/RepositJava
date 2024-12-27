package Works.HomeWork.HomeWork9.Les;

public class Dog extends Animal {

    public Dog(String name, int birthYear) {
        super(name, birthYear);
    }

    @Override
    public void makeSound() {
        out("Гав!");
    }

    @Override
    public void eat() {
        out("Кушатс");
    }
}
