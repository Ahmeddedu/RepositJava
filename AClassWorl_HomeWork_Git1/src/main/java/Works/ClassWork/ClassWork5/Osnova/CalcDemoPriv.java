package Works.ClassWork.ClassWork5.Osnova;

public class CalcDemoPriv {

    public static void main(String... args) {
        Calc c1 = new Calc();
        c1.plus(100);
        c1.minus(14);
    }

    public static void main1(String... args) {
        Calc c1 = new Calc();
        Calc c2 = new Calc();
        c2.plus(112);
        System.out.println(c1.plus(212));
        System.out.println(c1.plus(300));
        System.out.println(c1.minus(10));
        System.out.println( c1.minus(2));
        System.out.println("FINAL STATE:");
        System.out.println(c1.getCurrentValue());
        System.out.println("FINAL STATE OF c2:");
        System.out.println(c2.getCurrentValue());
    }
}