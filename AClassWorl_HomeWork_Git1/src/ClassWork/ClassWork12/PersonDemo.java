package ClassWork.ClassWork12;

public class PersonDemo {

    public static void main(String... args) {

        Person p1 = new Person();
        p1.setAge(11);
        p1.setName("Alex");

        Person p2 = p1;

        Person p3 = new Person();
        p3.setAge(11);
        p3.setName("Alex");

        if (p1 == p2){
            System.out.println("p1==p2");
        }else {
            System.out.println("p1!=p2");
        }

        if (p2 == p3){
            System.out.println("p2==p3");
        }else {
            System.out.println("p2!=p3");
        }

        if (p1 == p3){
            System.out.println("p1==p3");
        }else {
            System.out.println("p1!=p3");
        }

        p1.equals(p1);

        p1.equals(null);
        p1.equals("somestring");

        if (p1.equals(p3)){
            System.out.println("p1 eq p3");
        }else {
            System.out.println("p1 !eq p3");
        }

        Empty e = new Empty();
        System.out.println( " e class is : " + e.getClass());

    }
}