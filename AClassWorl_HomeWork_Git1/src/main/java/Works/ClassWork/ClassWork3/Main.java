package ClassWork.ClassWork3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int c = 11;
        int d = 12;
        System.out.print("Сумма " + c + " и " + d + ": ");
        printInt(sum(c, d));
        System.out.print("Умножение 5 и 6: ");
        printInt(multiply(5, 6));
        System.out.print("Меньшее число между 5 и 2: ");
        printInt(min(5, 2));
        System.out.print("Разность между 8 и 16: ");
        printInt(minus(8, 16));
        int[] arr = new int[]{9, 3, 4, 1};
        System.out.println("Элементы массива: ");
        printArray(arr);
        int lessResult = less3(arr);
        System.out.println("Первый элемент меньше 3: " + lessResult);
        int moreResult = more3(arr);
        System.out.println("Первый элемент больше 3: " + moreResult);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printInt(int out) {
        System.out.println(out);
    }

    public static int multiply(int a, int b) {
        return a != 0 && b != 0 ? a * b : 0;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static void printArray(int[] arg) {
        for(int i = 0; i < arg.length; ++i) {
            System.out.println(arg[i]);
        }

    }

    public static int less3(int[] arg) {
        for(int i = 0; i < arg.length; ++i) {
            if (arg[i] < 3) {
                return arg[i];
            }
        }

        return 0;
    }

    public static int more3(int[] arg) {
        for(int i = 0; i < arg.length; ++i) {
            if (arg[i] > 3) {
                return arg[i];
            }
        }

        return 0;
    }
}