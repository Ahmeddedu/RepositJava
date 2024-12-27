package ClassWork.ClassWork4;

public class Nov {
    public Nov() {
    }

    public static void main(String... args) {
        remainderTest();
        whiletest();
        continueTest();
        int a = 5;
        int b = 3;

        if (a != b) //  оператор равно или не равно
        {
            System.out.println("a не равно b");
        } else {
            System.out.println("a равно b");
        }
    }

    public static void continueTest() {
        System.out.println("Пример с continue:");

        for(int j = 1; j < 10; ++j) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

    }

    public static void remainderTest() {
        System.out.println("Пример с остатком от деления (%):");
        System.out.println("11 % 2 = 1");//означает, что при делении 11 на 2, остаток равен 1
        System.out.println("10 % 2 = 0");//означает, что при делении 10 на 2, остаток равен 0, так как 10 делится на 2 без остатка.
    }

    public static void whiletest() {
        int i = 1;
        boolean letsContinue = true;
        System.out.println("Пример с циклом while:");

        while(letsContinue) {
            System.out.println(i);
            ++i;
            if (i > 10) {
                letsContinue = false;
            }
        }

    }
}