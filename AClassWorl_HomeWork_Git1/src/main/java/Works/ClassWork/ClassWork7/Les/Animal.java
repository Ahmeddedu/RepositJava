package Works.ClassWork.ClassWork7.Les;

// Абстрактный класс Animal (животное)
public abstract class Animal implements Noisi{

    // Поле для хранения имени животного
    protected String name;

    // Конструктор для задания имени
    public Animal(String name) {
        this.name = name;
    }

    // Абстрактный метод, который должны реализовать подклассы
    public abstract void makeSound();

    // Метод для вывода имени животного
    protected void whoAmI() {
        System.out.print(name + ": "); // Форматированный вывод имени
    }

    // Универсальный метод для вывода информации с именем
    protected void out(String smth) {
        whoAmI(); // Вывод имени
        System.out.println(smth); // Вывод дополнительной информации
    }
}
