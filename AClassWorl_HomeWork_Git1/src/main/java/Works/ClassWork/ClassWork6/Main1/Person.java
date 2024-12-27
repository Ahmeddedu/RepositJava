package ClassWork.ClassWork6.Main1;

public class Person {

    public String name;
    public String lastName;

    public Person() {
        System.out.println("Hello I'm empty constructor");
    }

    public Person(String n, String ln) {
        name = n;
        lastName = ln;
    }

    public void printHello() {
        System.out.println("Hello! I am " + name + " " + lastName);
    }
}
