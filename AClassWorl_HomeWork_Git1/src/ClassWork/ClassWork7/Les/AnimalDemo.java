package ClassWork.ClassWork7.Les;

// Главный класс с методом main для демонстрации работы программы
public class AnimalDemo {
    public static void main(String[] args) {

        // Создание объектов Cat (кошки)
        Cat c = new Cat("Том");
        Cat c1 = new Cat("НочнойТигидик");
        Cat y = new Cat("ДругойНочнойТигидик");

        // Создание объектов Dog (собаки)
        Dog d = new Dog("Кеша");
        Dog e = getPet("Шарик");

        // Создание объекта Mouse (мышь)
        Mouse m = new Mouse("Евдокия");

        // Создание объекта Tractor (трактор)
        Tractor t = new Tractor();

        // Вызовы методов для объектов Cat
        c.makeSound();  // Том издает звук
        c.tigidik();  // Том издает звук "Тигидик"
        c1.tigidik();  // НочнойТигидик издает звук "Тигидик"
        c1.makeSound();  // НочнойТигидик издает звук

        // Вызовы методов для объектов Dog
        d.makeSound();  // Кеша издает звук
        e.makeSound();  // Шарик издает звук

        // Вызов метода для объекта Mouse
        m.makeSound();  // Евдокия издает звук

        // Вызов метода для объекта Tractor
        t.makeSound();  // Трактор издает звук

        // Демонстрация работы метода getNoisyObject
        Noisi noisyObject = getNoisyObject(1);  // Уровень шума 1
        noisyObject.makeSound();  // Звук, издаваемый объектом с уровнем шума 1
        noisyObject = getNoisyObject(6);  // Уровень шума 6
        noisyObject.makeSound();  // Звук, издаваемый объектом с уровнем шума 6
        noisyObject = getNoisyObject(9);  // Уровень шума 9
        noisyObject.makeSound();  // Звук, издаваемый объектом с уровнем шума 9
    }

    // Метод для создания объекта Dog
    public static Dog getPet(String name) {
        return new Dog(name);  // Возвращаем объект Dog с переданным именем
    }

    // Метод для получения объекта в зависимости от уровня шума
    public static Noisi getNoisyObject(int noiseLevel) {
        if (noiseLevel < 3) {
            return new Mouse("Микки");  // Если уровень шума меньше 3, возвращаем мышь
        }
        if (noiseLevel < 7) {
            return new Cat("Симон");  // Если уровень шума меньше 7, возвращаем кошку
        }
        if (noiseLevel < 18) {
            return new Dog("Патрон");  // Если уровень шума меньше 18, возвращаем собаку
        }
        return new Tractor();  // Если уровень шума выше, возвращаем трактор
    }
}
