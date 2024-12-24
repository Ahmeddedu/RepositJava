package HomeWork.HomeWork14;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hww {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сделай из вариантов (view, edit, copy):");
        String action = scanner.nextLine();

        switch (action) {
            case "view":
                viewFile(scanner);
                break;
            case "edit":
                editFile(scanner);
                break;
            case "copy":
                copyFile(scanner);
                break;
            default:
                System.out.println("Чо за действие я не знаю такое сделай что я предлагаю 0_0");
        }
    }

    private static void viewFile(Scanner scanner) {
        System.out.println("Название файлы давай  : ");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка тут чот не так сам разберайся я на джаве а не на питоне чтобы ошибки писать " + e.getMessage());
        }
    }

    private static void editFile(Scanner scanner) {
        List<String> lines = new ArrayList<>();
        System.out.println("Пиши уже (напиши exit чтобы завершить):");

        while (true) {
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            lines.add(line);
        }

        System.out.println("Название придумай ( не тупое пж ) :");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ощибка странная " + e.getMessage());
        }
    }

    private static void copyFile(Scanner scanner) {
        System.out.println("Напиши название источника файла :");
        String sourceFile = scanner.nextLine();
        System.out.println("Напиши название файла назначения 0_0:");
        String destinationFile = scanner.nextLine();

        Path sourcePath = Paths.get(sourceFile);
        Path destinationPath = Paths.get(destinationFile);

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Все готово все скопиравано");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании чот не так: " + e.getMessage());
        }
    }
}

