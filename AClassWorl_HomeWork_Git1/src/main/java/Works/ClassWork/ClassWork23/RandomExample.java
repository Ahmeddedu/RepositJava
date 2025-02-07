package Works.ClassWork.ClassWork23;

import java.util.Random;

public class RandomExample { // Переименовали класс
    public static void main(String... args) {
        randomRandom(); // Вызов метода для демонстрации работы с Random
    }

    /**
     * Метод демонстрирует генерацию случайных значений с использованием класса Random.
     */
    private static void randomRandom() {
        Random r = new Random();

        // Генерация случайных булевых значений
        System.out.println("Случайные булевые значения:");
        System.out.println(r.nextBoolean());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextBoolean());

        System.out.println("-------------------");

        // Генерация случайных целых чисел
        System.out.println("Случайные числа в разных диапазонах:");
        System.out.println("От 0 до 2: " + r.nextInt(3)); // Число от 0 до 2
        System.out.println("От 0 до 17: " + r.nextInt(18)); // Число от 0 до 17
        System.out.println("От 0 до 2: " + r.nextInt(3));
        System.out.println("От 0 до 2: " + r.nextInt(3));
    }

    /**
     * Метод возвращает случайное число в заданном диапазоне [min, max].
     * @param min Минимальное значение диапазона
     * @param max Максимальное значение диапазона
     * @return Случайное число в указанном диапазоне
     */
    private static int randomRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    /**
     * Метод демонстрирует использование Math.random() для генерации чисел.
     */
    private static void mathRandom() {
        System.out.println("Случайные числа от 0 до 1:");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        System.out.println("-------------------");
        System.out.println("Начинаем более осмысленные вычисления");

        double a = Math.random(); // Число от 0 до 1
        System.out.println("Случайное число: " + a);

        // Генерация случайного числа от 0 до 5
        a = a * 5;
        System.out.println("Увеличенное значение: " + a);

        long t = Math.round(a); // Округление до целого числа
        System.out.println("Округленное число: " + t);

        // Генерация случайного числа в диапазоне [10, 15]
        System.out.println("Случайное число от 10 до 15: " + (t + 10));

        System.out.println("-------------------");
        System.out.println("Дополнительные случайные числа от 0 до 10:");
        System.out.println(Math.round(Math.random() * 10));
        System.out.println(Math.round(Math.random() * 10));
        System.out.println(Math.round(Math.random() * 10));
        System.out.println(Math.round(Math.random() * 10));
        System.out.println(Math.round(Math.random() * 10));
    }
}
