package ClassWork.ClassWork3;

public class Person {
    public String name;
    public String surname;

    public Person() {
    }

    public void hello() {
        System.out.println("Hello, I am " + this.name + " " + this.surname);
    }
}