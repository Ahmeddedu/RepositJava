package HomeWork.HomeWork2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String lala = "lalalalalala";
        System.out.println("Length: " + lala.length());

        if (lala.length() > 10) {
            System.out.println("Довгенька");
        } else {
            System.out.println("Коротенька");
        }

        System.out.println(lala.toUpperCase());

        int[] ar = new int[]{1, 3, 9, 5, 7, 2};
        System.out.println("Значення:");

        for (int i = 0; i < ar.length; i++) {
            System.out.println("" + ar[i]);
        }

        System.out.print("Наоборот: ");
        System.out.println();

        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();
        System.out.println("Більші за 3:");

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 3) {
                System.out.print(ar[i] + " ");
            }
        }

        System.out.println();

        boolean less = false;

        for (int j = 0; j < ar.length; j++) { // Замена i на j
            if (ar[j] < 2) {
                less = true;
                break;
            }
        }

        if (less) {
            System.out.println("Знайшовсь!");
        }
    }
}
