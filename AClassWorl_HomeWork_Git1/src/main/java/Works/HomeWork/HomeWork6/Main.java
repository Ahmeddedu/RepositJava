package Works.HomeWork.HomeWork6;

public class Main {
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

        for (int x : a) {
            System.out.println(x);
        }
    }

    public static int[] sortArray(int[] input) {
        boolean needMore = true;
        int left = 0;
        int right = input.length - 1;// из за -1 я не мог понять почему код не работает минут 15

        // сам метод я подсмотрел в интернете
        while (needMore) {
            needMore = false;

            for (int i = left; i < right; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    needMore = true;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (input[i] < input[i - 1]) {
                    int temp = input[i];
                    input[i] = input[i - 1];
                    input[i - 1] = temp;
                    needMore = true;
                }
            }
            left++;
        }

        return input;
    }
}