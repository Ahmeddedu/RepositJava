package Works.HomeWork.HomeWork1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int summa = 0;

        // Вариант 1: С использованием цикла для вычисления суммы
        for (int i = 110; i <= 120; i++) {
            summa += i;
        }

        System.out.println("Сумма чисел від 110 до 120: " + summa);

        // Вариант 2: С использованием сложения чисел напрямую
        int summa2 = 0;
        summa2 += 110;  // Прямое добавление
        summa2 += 111;  // Прямое добавление
        summa2 += 112;  // Прямое добавление
        summa2 += 113;  // Прямое добавление
        summa2 += 114;  // Прямое добавление
        summa2 += 115;  // Прямое добавление
        summa2 += 116;  // Прямое добавление
        summa2 += 117;  // Прямое добавление
        summa2 += 118;  // Прямое добавление
        summa2 += 119;  // Прямое добавление
        summa2 += 120;  // Прямое добавление

        System.out.println("Сумма чисел від 110 до 120 іншим способом: " + summa2);
    }
}
