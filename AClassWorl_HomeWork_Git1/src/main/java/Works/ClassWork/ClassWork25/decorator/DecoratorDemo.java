package Works.ClassWork.ClassWork25.decorator;

public class DecoratorDemo {
    public static void main(String... args){
        WaterCup w = new WaterCup();

        Cappucino c = new Cappucino();

        System.out.println("water cost: " + w.cost() );
        System.out.println("water ingridients: " + w.ingridients() );
        System.out.println("capuccino cost : " + c.cost() );
        System.out.println("cappucino ingridients : " + c.ingridients() );
    }
}
