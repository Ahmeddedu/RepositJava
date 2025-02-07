package Works.HomeWork.HomeWork23;

import java.util.Random;

public class ArraysHW {
    public static void main(String... args) {

        // я сделал так чтобы сначали были вызовы методов а снизу уже основной код так удобнее
        // Задача 1
        int size = 4;
        int[][] ar2 = RandSiz(size);
        printArray(ar2);// я отдельно сделал методы для вывода 

        // Задача 2
        int count7 = 0;
        int count11 = 0;
        int count18 = 0;

        for (int i = 0; i < ar2.length; i++) {// я не знаю может можно сделать проше
            for (int j = 0; j < ar2[i].length; j++) {
                if (ar2[i][j] == 7) count7++;
                if (ar2[i][j] == 11) count11++;
                if (ar2[i][j] == 18) count18++;
            }
        }

        System.out.println("Количество 7: " + count7);
        System.out.println("Количество 11: " + count11);
        System.out.println("Количество 18: " + count18);


        // 3
        Diog(ar2);
        printArray(ar2);

        // 4
        Diog10(ar2);
        printArray(ar2);
    }

    // создание масива
    private static int[][] RandSiz(int size) {
        int[][] array = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = rand.nextInt(10) + 9;// тут я запутался потомучто вроде он 10 не считает или считает
            }
        }
        return array;
    }

    // нолики
    private static void Diog(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }
    }

    //  умнож на 10
    private static void Diog10(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i ; j < array[i].length; j++) {//мне кажеится я намудрил но вроде работает
                array[i][j] *= 10;// я делал умножение просто * а он не пропускает я забил в инете и понял что надо *=
            }
        }
    }

    // вывод масивов
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();//чтобы масивы не смешивались в одно
        }
        System.out.println();
    }
}
