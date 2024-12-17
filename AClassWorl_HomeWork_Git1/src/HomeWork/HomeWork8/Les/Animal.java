package HomeWork.HomeWork8.Les;

public abstract class Animal implements Noisi {

    protected String name;
    protected int birthYear; // Поле для года рождения 1 задание

    public Animal(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;  // принимаем значение
    }

    public abstract void makeSound();

    protected void whoAmI() {
        System.out.print(name + " " + birthYear + ": ");
    }

    protected void out(String smth) {
        whoAmI();
        System.out.println(smth);
    }

    public abstract void eat();
}
