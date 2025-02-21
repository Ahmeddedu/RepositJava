package Works.HomeWork.HomeWork26.decorator;

public class CoffeeBuilder {
    private Beverage beverage;

    public CoffeeBuilder() {
        this.beverage = new Coffee();
    }

    public CoffeeBuilder espresso() {
        this.beverage = new Coffee();
        return this;
    }

    public CoffeeBuilder cappuccino() {
        this.beverage = new Cappucino();
        return this;
    }

    public CoffeeBuilder addMilk() {
        this.beverage = new AdditionalMilk(beverage);
        return this;
    }

    public CoffeeBuilder addSugar() {
        this.beverage = new AdditionalSugar(beverage);
        return this;
    }

    public Beverage build() {
        // тут крч добавление цены в синглтон,мне тут помог ии я просто не мог написать и мне выдавало ошибку ( не снижайте за это оценку пожайлуйста )
        CafeSingleton.getInstance().addToCount(beverage.cost());
        return beverage;
    }
}