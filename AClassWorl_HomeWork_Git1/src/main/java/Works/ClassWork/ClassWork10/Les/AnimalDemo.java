package Works.ClassWork.ClassWork10.Les;

public class AnimalDemo {

    public static void main(String... args) {
        Zoo zoo = buildZoo();
        System.out.println(zoo.addAnimal(new Cat("0" , 2020) ) );
        System.out.println(zoo.addAnimal(new Dog("1" , 2019) ) );
        System.out.println(zoo.addAnimal(new Dog("2" , 2019) ) );
        System.out.println(zoo.addAnimal(new Cat("3" , 2020) ) );
        System.out.println(zoo.addAnimal(new Cat("2,5" ,  2020) ,3) );

        zoo.makeAnimalFree(2);
        zoo.makeNoise();
    }

    public static Zoo buildZoo() {
        return new LinkedZoo();
    }
}