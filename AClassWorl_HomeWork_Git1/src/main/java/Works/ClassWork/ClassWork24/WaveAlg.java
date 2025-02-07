package Works.ClassWork.ClassWork24;

public class WaveAlg {

    private int[][] field; // Игровое поле, где -1 - препятствия, 0 - пустые клетки, >0 - волна

    public WaveAlg(int[][] field) {
        this.field = field;
    }

    public Point[] findTheWay(int x, int y, int x1, int y1) {
        printField(); // Выводим поле в консоль для визуализации

        field[y][x] = 1; // Устанавливаем стартовую точку волны
        boolean wasChanged = true;
        while (wasChanged) { // Пока волна распространяется
            wasChanged = false;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (isActiveField(j, i)) { // Проверяем, активна ли точка волны
                        if (moveWaveFurther(j, i)) { // Распространяем волну на соседние клетки
                            wasChanged = true;
                        }
                    }
                }
            }
            printField(); // Выводим текущее состояние поля
        }
        return null; // Метод пока не возвращает путь, но может быть доработан
    }

    public boolean isActiveField(int x, int y) {
        return field[y][x] > 0; // Проверяем, является ли клетка частью волны
    }

    public boolean moveWaveFurther(int x, int y) {
        boolean res = false;
        if (x > 0 && field[y][x - 1] == 0) { // Двигаемся влево
            field[y][x - 1] = field[y][x] + 1;
            res = true;
        }
        if (y > 0 && field[y - 1][x] == 0) { // Двигаемся вверх
            field[y - 1][x] = field[y][x] + 1;
            res = true;
        }
        if (x < field[y].length - 1 && field[y][x + 1] == 0) { // Двигаемся вправо
            field[y][x + 1] = field[y][x] + 1;
            res = true;
        }
        if (y < field.length - 1 && field[y + 1][x] == 0) { // Двигаемся вниз
            field[y + 1][x] = field[y][x] + 1;
            res = true;
        }
        return res; // Возвращает true, если было распространение волны
    }

    private void printField() { // Выводит поле в консоль для отладки
        for (int[] row : field) {
            for (int cell : row) {
                printValue(cell);
            }
            println();
        }
    }

    private void printValue(int v) { // Форматированный вывод значений поля
        if (v == -1) {
            System.out.print("###"); // Препятствие
        } else if (v == 0) {
            System.out.print("   "); // Пустая клетка
        } else if (v < 10) {
            System.out.print("  " + v); // Однозначное число
        } else {
            System.out.print(" " + v); // Двузначное число
        }
    }

    private void println() { // Перенос строки для вывода поля
        System.out.println();
    }

    private boolean isFinish(int x, int y) {
        return false; // Заготовка для проверки достижения финиша (пока не используется)
    }
}
