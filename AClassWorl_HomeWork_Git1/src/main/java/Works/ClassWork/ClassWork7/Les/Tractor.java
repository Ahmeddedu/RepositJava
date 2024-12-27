package Works.ClassWork.ClassWork7.Les;

// Класс Tractor, представляющий трактор, который реализует интерфейс Noisy
public class Tractor implements Noisi {

    // Реализация метода makeSound для трактора
    @Override
    public void makeSound() {
        System.out.println("Вжжжжжж!");  // Звук, который издает трактор
    }
}
