package Works.ClassWork.ClassWork23;

public class Arrays {
    public static void main(String... args) {

        // Массив строк
        String[] ar111 = {"www", "222", "1111"};
        String s = ar111[0];

        // Инициализация двумерного массива
        int[][] ar = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Элемент в [0][1]: " + ar[0][1]); // Выведет 2

        // Создаем пустой массив 4x4
        int[][] arr = new int[4][4];

        // Заполняем массив числами от 0 до 15
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = t;
                t++;
            }
        }

        // Визуализация структуры массива 4x4
        // 0   1   2   3
        // 4   5   6   7
        // 8   9  10  11
        // 12 13  14  15

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        printArray(arr);

        // Транспонирование (замена строк на столбцы)
        System.out.println("Транспонирование массива...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) { // i <= j, чтобы избежать двойного обмена
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Визуализация транспонированного массива 4x4
        // 0   4   8   12
        // 1   5   9   13
        // 2   6  10   14
        // 3   7  11   15

        // Вывод измененного массива
        System.out.println("Транспонированный массив:");
        printArray(arr);

        // Подсчет суммы всех элементов массива
        int finalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                finalSum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов: " + finalSum);
    }

    /**
     * Метод вывода двумерного массива в консоль.
     */
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }
}
