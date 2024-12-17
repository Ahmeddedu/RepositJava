package ClassWork.ClassWork7.Les;

// Класс Dog, представляющий собаку, который расширяет абстрактный класс Animal
public class Dog extends Animal {

    // Конструктор, который принимает имя собаки
    public Dog(String name) {
        super(name);  // Вызов конструктора родительского класса
    }

    // Реализация метода makeSound для собаки
    @Override
    public void makeSound() {
        out("Гав!");  // Выводим звук, который издает собака
    }
}
