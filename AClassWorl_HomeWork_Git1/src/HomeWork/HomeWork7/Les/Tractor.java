package HomeWork.HomeWork7.Les;

public class Tractor implements Noisi {

    @Override
    public void makeSound() {
        System.out.println("Вжжжжжж!");
    }

    public void eat() {
        System.out.println("Жру соляру");
    }
}