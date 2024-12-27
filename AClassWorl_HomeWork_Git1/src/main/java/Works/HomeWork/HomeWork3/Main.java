package Works.HomeWork.HomeWork3;

public class Main {
    public Main() {
    }

    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }

    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        if (d < min) {
            min = d;
        }

        return min;
    }

    public static int more5(int[] array) {
        int count = 0;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] > 5) {
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Наименьшее из трёх: " + min3(3, 7, 1));
        System.out.println("Наименьшее из четырёх: " + min4(8, 4, 9, 3));
        int[] array = new int[]{1, 6, 3, 9, 7, 8, 2, 2, 2, 4};
        System.out.println("Количество элементов больше 5: " + more5(array));
    }
}