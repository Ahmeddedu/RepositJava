package ClassWork.ClassWork8.Les;

public class AnimalDemo {

    public static void main(String... args) {
        Zoo zoo = buildZoo();
        System.out.println(zoo.addAnimal(new Cat("Simons" , 2020) ) );
        System.out.println(zoo.addAnimal(new Dog("Kiks" , 2019) ) );
        zoo.makeNoise();
    }

    public static Zoo buildZoo() {
        return new CritycallySmallZoo();
    }
}
