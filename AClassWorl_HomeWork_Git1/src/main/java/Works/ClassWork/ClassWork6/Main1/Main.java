package Works.ClassWork.ClassWork6.Main1;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        int[] b = a;

        b[3] = 8;
        System.out.println(a[3]);

        System.out.println("Изменённый масив тот что у нас уже был новый не создан");

        for (int x : a) {
            System.out.println(x + " ");
        }

        // 4 6 8 1 2 5

        // Способ сортирования масива
        // 4 6 8 1 2 5
        // 4 6 1 8 2 5
        // 4 6 1 2 5 8
        // 4 1 6 2 5 8
        // 1 4 2 5 6 8
        // 1 4 6 2 5 8
        // 1 2 4 6 5 8
        // 1 2 4 5 6 8

        int[] sortedArray = new int[6];
        sortedArray[0] = 4;
        sortedArray[1] = 6;
        sortedArray[2] = 8;
        sortedArray[3] = 1;
        sortedArray[4] = 2;
        sortedArray[5] = 5;

        sortedArray = sortArray(sortedArray);



        System.out.println("Отсортированный массив:");
        for (int x : sortedArray) {
            System.out.print(x + " ");
        }
    }

    public static int[] sortArray(int[] input) {
        boolean needMore = true;

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
        }
        return input;
    }
}
