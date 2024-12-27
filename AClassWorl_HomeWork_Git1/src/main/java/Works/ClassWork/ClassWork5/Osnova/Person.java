package ClassWork.ClassWork5.Osnova;

public class Person {
    public String name;
    public String lastName;

    public  void printHello(){
        System.out.println("Hello! I am " + name + " " + lastName);
    }

    public static String type;
    public static void printType() {
        System.out.println(type);
    }
}
