package ClassWork.ClassWork7.Les;

// Класс Mouse, представляющий мышь, который расширяет абстрактный класс Animal
public class Mouse extends Animal {

    // Конструктор, который принимает имя мыши
    public Mouse(String name) {
        super(name);  // Вызов конструктора родительского класса
    }

    // Реализация метода makeSound для мыши
    @Override
    public void makeSound() {
        out("Пищит!");  // Выводим звук, который издает мышь
    }
}
