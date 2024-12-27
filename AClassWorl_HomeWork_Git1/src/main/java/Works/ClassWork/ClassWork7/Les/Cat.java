package Works.ClassWork.ClassWork7.Les;

// Класс Cat, представляющий кошку, который расширяет абстрактный класс Animal
public class Cat extends Animal {

    // Конструктор, который принимает имя кошки
    public Cat(String name) {
        super(name);  // Вызов конструктора родительского класса
    }

    // Реализация метода makeSound для кошки
    @Override
    public void makeSound() {
        out("Мяу!");  // Выводим звук, который издает кошка
    }

    // Дополнительный метод, который издает звук "Тигидик"
    public void tigidik() {
        out("Тигидик тигидик!");
    }
}
