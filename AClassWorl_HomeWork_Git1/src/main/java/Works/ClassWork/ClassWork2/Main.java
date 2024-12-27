package Works.ClassWork.ClassWork2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String str0 = "lalalalala";
        String str1 = str0.toUpperCase();
        String str2 = str0.replace("a", "1");
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("  next  ");
        int a = 8;
        int b = 8;
        if (a > b) {
            System.out.println("a bigger than b");
        } else if (a == b) {
            System.out.println("b = a");
        } else {
            System.out.println("b bigger than  a");
        }           

        System.out.println("Done");
        System.out.println("  next  ");

        int i;
        for(i = 5; i >= 1; --i) {
            System.out.println("a" + i);
        }

        System.out.println("  next  ");

        for(i = 1; i <= 5; ++i) {
            System.out.println("v" + i);
        }

        System.out.println("  next  ");
        int[] ar = new int[]{12, 2, 3, 4, 5};
        System.out.println(ar[0]);
        ar[0] = 24;
        System.out.println(ar[0]);
    }
}