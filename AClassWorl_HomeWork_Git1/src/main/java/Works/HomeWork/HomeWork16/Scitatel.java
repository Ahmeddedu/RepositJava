package Works.HomeWork.HomeWork16;

import java.util.Scanner;

public class Scitatel {

    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println(0);
            scanner.close();
            return;
        }

        input = input.replaceAll("\\d", "");

        String[] parts = input.split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        parts = input.split("\\.");
        for (String part : parts) {
            System.out.println(part);
        }

        parts = input.split("\\W+");
        for (String part : parts) {
            System.out.println(part);
        }

        int count = 0;
        for (String part : parts) {
            if (part.length() >= 3) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
