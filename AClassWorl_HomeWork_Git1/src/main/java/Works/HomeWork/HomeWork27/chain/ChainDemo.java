package Works.HomeWork.HomeWork27.chain;

import java.util.Scanner;

public class ChainDemo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // я + добавил ввод текста то мне лень вписывать сбда

        StringFilter digitFilter = new DigitFilter();
        StringFilter trimFilter = new TrimFilter();
        StringFilter minLengthFilter = new mindlin();
        StringFilter maxLengthFilter = new maxdlin();

        digitFilter.setNext(trimFilter);
        trimFilter.setNext(minLengthFilter);
        minLengthFilter.setNext(maxLengthFilter);

        System.out.print("Пиши сюда ");
        String input = scanner.nextLine();

        String result = digitFilter.process(input);

        System.out.println("Вхідний рядок: |" + input + "|");
        System.out.println("Оброблений рядок: |" + result + "|");

        scanner.close();
    }
}