package Works.ClassWork.ClassWork6.Main1;

public class Teacher {
    public static void main(String... args) {
        int[] a = new int[10];
        a[0] = 1;
        a[1] = 5;
        a[2] = 8;
        a[3] = 4;
        a[4] = 3;
        a[5] = 5;
        a[6] = 7;
        a[7] = 4;
        a[8] = 8;
        a[9] = 9;

        a = sortArray(a);

        // Вывод отсортированного массива
        for (int x : a) {
            System.out.println(x);
        }
    }

    public static int[] sortArray(int[] input) {
        boolean needMore = true;

        // Печать исходного массива
        printArray(input);

        while (needMore) {
            needMore = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    needMore = true;
                }
            }

            // Печать массива после каждой итерации сортировки
            if (needMore)
                printArray(input);
        }

        return input;
    }

    public static int[] copyArray(int[] input) {
        int[] res = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            res[i] = input[i];
        }
        return res;
    }

    public static void printArray(int[] input) {
        for (int x : input) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
