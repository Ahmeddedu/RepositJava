package Works.HomeWork.HomeWork16;

public class ScitatelNePolz {

    public static void main(String... args) {

        String input = "dsfsdf sdfkokj sdflkj ljdsgklj sdkjfhskj fdd";

        if (input.isEmpty()) {
            System.out.println("0");
            return;
        }

        System.out.println("Удаляем все цифры");
        input = input.replaceAll("\\d", "");

        String[] parts = input.split(",");
        System.out.println("Разделение по запятым");
        for (String part : parts) {
            System.out.println(part);
        }

        parts = input.split("\\.");
        System.out.println("Разделение по точкам");
        for (String part : parts) {
            System.out.println(part);
        }

        parts = input.split("\\W+");// я этот способ \W+ увидел в интете и не уверен что он правильно работает но если работает лдучше не трогать
        System.out.println("Разделение по другим символам");
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
    }

    public static int count(String input) {
        if (input.isEmpty()) {
            System.out.println("0");
            return 0;
        }

        input = input.replaceAll("\\d", "");

        String[] parts = input.split("\\W+");// я этот способ \W+ увидел в интете и не уверен что он правильно работает но если работает лдучше не трогать


        int count = 0;
        for (String part : parts) {
            if (part.length() >= 3) {
                count++;
            }
        }
        return count;
    }

}
