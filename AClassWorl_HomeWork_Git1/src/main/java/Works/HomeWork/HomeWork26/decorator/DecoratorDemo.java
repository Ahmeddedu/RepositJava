package Works.HomeWork.HomeWork26.decorator;

public class DecoratorDemo {
    public static void main(String... args) {
        Beverage b1 = new CoffeeBuilder().espresso().addMilk().addMilk().addSugar().build();
        System.out.println("1");
        System.out.println("Цена" + b1.cost());
        System.out.println("Что внутри " + b1.ingridients());

        Beverage b2 = new CoffeeBuilder().addMilk().addSugar().build();
        System.out.println("1");
        System.out.println("Ц ен" + b2.cost());
        System.out.println("Что внутри" + b2.ingridients());

        System.out.println("Общяя цена" + CafeSingleton.getInstance().getCount());
    }
}