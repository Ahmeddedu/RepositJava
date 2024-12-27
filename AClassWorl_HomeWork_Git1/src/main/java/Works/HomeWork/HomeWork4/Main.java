package Works.HomeWork.HomeWork4;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[7];  // Правильный размер массива
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 2;
        numbers[5] = 60;
        numbers[6] = 5;

        int min = findMin(numbers);
        System.out.println("Наймаленький элемент : " + min);

        System.out.println("Простые числа до 100:");
        for (int i = 2; i <= 100; i += 1) {
            if (isSimple(i)) {
                System.out.println(i);
            }
        }
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        int i = 0;

        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i += 1;
        }
        return min;
    }

    public static boolean isSimple(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i < a; i += 1) {
            if (a % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
