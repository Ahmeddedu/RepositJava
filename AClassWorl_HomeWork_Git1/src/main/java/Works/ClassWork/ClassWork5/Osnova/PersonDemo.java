package Works.ClassWork.ClassWork5.Osnova;

public class PersonDemo {
    public static void main(String... args) {
        Person p1 = new Person(); // new object
        Person p2 = new Person(); // and once more

        p1.name = "Taras";
        p1.lastName = "Kochiviski";

        p2.name = "Pavel";
        p2.lastName = "Lilotsik";

        Person.type = "something";
        Person.printType();

        p1.printHello();
        p2.printHello();
    }
}
