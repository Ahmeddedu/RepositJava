package HomeWork.HomeWork8.Les;

public class Mouse extends Animal {

    public Mouse(String name, int birthYear) {
        super(name, birthYear);
    }

    @Override
    public void makeSound() {
        out("Пищит!");
    }

    @Override
    public void eat() {
        out("Орехи урааа");
    }
}
