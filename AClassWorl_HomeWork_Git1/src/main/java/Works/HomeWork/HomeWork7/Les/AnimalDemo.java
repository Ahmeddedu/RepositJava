package Works.HomeWork.HomeWork7.Les;

public class AnimalDemo {
    public static void main(String[] args) {

        Cat c = new Cat("Том", 2020);
        Cat c1 = new Cat("НочнойТигидик", 2019);
        Cat y = new Cat("ДругойНочнойТигидик", 2021);

        Dog d = new Dog("Кеша", 2018);
        Dog e = getPet("Шарик", 2017);

        Mouse m = new Mouse("Евдокия", 2022);

        Tractor t = new Tractor();

        c.makeSound();
        c.tigidik();
        c1.tigidik();
        c1.makeSound();

        d.makeSound();
        e.makeSound();

        m.makeSound();

        t.makeSound();

        // Вызовы метода eat то што и в дз для каждого объекта
        c.eat();  // Кошка ест
        d.eat();  // Собака ест
        m.eat();  // Мышь ест
        t.eat();  // Трактор работает

        Noisi noisyObject = getNoisyObject(1);
        noisyObject.makeSound();
        noisyObject = getNoisyObject(6);
        noisyObject.makeSound();
        noisyObject = getNoisyObject(9);
        noisyObject.makeSound();
    }

    public static Dog getPet(String name, int birthYear) {
        return new Dog(name, birthYear);
    }

    public static Noisi getNoisyObject(int noiseLevel) {
        if (noiseLevel < 3) {
            return new Mouse("Микки", 2023);
        }
        if (noiseLevel < 7) {
            return new Cat("Симон", 2021);
        }
        if (noiseLevel < 18) {
            return new Dog("Патрон", 2015);
        }
        return new Tractor();
    }
}
