package HomeWork.HomeWork7.Les;

public class Cat extends Animal {

    public Cat(String name, int birthYear) {
        super(name, birthYear);
    }

    @Override
    public void makeSound() {
        out("Мяу!");
    }

    public void tigidik() {
        out("Тигидик тигидик!");
    }

    @Override
    public void eat() {
        out("Хрум");
    }
}
