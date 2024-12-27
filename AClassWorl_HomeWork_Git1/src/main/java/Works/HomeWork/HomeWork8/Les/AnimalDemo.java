package HomeWork.HomeWork8.Les;

public class AnimalDemo {

    public static void main(String... args) {
        Zoo zoo = buildZoo();
        System.out.println(zoo.addAnimal(new Cat("Simons" , 2020) ) );
        System.out.println(zoo.addAnimal(new Dog("Kiks" , 2019) ) );
        System.out.println(zoo.addAnimal(new Dog("Kiks" , 2019) ) );
        zoo.makeNoise();
        zoo.makeAnimalFree(0);// сюда надо вписать какой именно в масиве тнужно убрать от 0 до беск по базе
        zoo.makeNoise();
    }

    public static Zoo buildZoo() {
        return new FlexibleZoo();
    }
}
