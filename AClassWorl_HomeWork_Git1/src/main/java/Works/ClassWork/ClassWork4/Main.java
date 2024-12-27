package Works.ClassWork.ClassWork4;

public class Main {
    public Main() {
    }

    public static void main(String... args) {

        // Основные операторы логики:
        // &&  - оператор "И" (AND), возвращает true, если оба условия истинны
        // ||  - оператор "ИЛИ" (OR), возвращает true, если хотя бы одно условие истинно
        // !   - оператор "НЕ" (NOT), инвертирует значение (true -> false и наоборот)

        // Примеры работы с логическими операторами:
        // true && true   -> true
        // true && false  -> false
        // false && true  -> false
        // false && false -> false

        // true || false  -> true
        // false || true  -> true
        // true || true   -> true
        // false || false -> false

        // !true          -> false
        // !false         -> true

        // != оператор нераавенства ( равно или не равно )
        int a = 17;
        int b = 2;

        // Проверка условия: a в диапазоне от 1 до 10 включительно или a равно 17
        if ((a >= 1 && a <= 10) || a == 17) {
            System.out.println("1. a находится между 1 и 10 или равно 17");
        }

        // Проверка, что a не находится между 1 и 10
        if (a < 1 || a > 10) {
            System.out.println("2. a не находится между 1 и 10");
        }

        // Проверка с использованием NOT: a не находится между 1 и 10
        if (!(a >= 1 && a <= 10)) {
            System.out.println("3. a не находится между 1 и 10 или равно 17");
        }

    }

    // Рекурсивный метод вывода чисел от i до 10
    public static void neverEndingOutPrevious(int i) {
        if (i > 10) {
            return;
        }
        System.out.println(i);
        neverEndingOutPrevious(i + 1);
    }

    // Рекурсивный метод вывода чисел от i до 0
    public static int outPrevious(int i) {
        if (i == 0) {
            return i;
        }
        System.out.println(i);
        return outPrevious(i - 1);
    }

    // Пример использования оператора continue: выводит только нечётные числа
    public static void continueTest() {
        System.out.println("Тест с continue:");
        for (int j = 1; j < 100; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }
    }

    // Тест на вычисление остатка от деления
    public static void remainderTest() {
        System.out.println("11 % 2 = " + (11 % 2));
        System.out.println("10 % 2 = " + (10 % 2));
    }

    // Пример использования цикла while: печатает числа от 1 до 1000
    public static void whileTest() {
        int i = 1;
        boolean letsContinue = true;

        while (letsContinue) {
            System.out.println(i);
            i++;
            if (i > 1000) {
                letsContinue = false;
            }
        }
    }

    // Рекурсивный метод для нахождения суммы от 1 до i
    public static int recursiveSum(int i) {
        if (i == 0) {
            return 0;
        }
        int prevSum = recursiveSum(i - 1);
        int res = i + prevSum;
        // Пример: 3 + recursiveSum(2), где recursiveSum(2) = 2 + recursiveSum(1), и так далее
        return res;
    }
}
