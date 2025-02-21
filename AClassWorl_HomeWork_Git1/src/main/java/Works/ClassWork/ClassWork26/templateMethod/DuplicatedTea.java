package Works.ClassWork.ClassWork26.templateMethod;

public class DuplicatedTea {
    public void makeIt() {
        boilingWater();
        pourWater();
        addingTea();
        ready();
    }

    public void boilingWater() {
        System.out.println("boiling water");
    }

    public void pourWater() {
        System.out.println("pouring water");
    }

    public void addingTea() {
        System.out.println("adding Tea 2 the cup");
    }

    public void ready() {
        System.out.println("beverage is ready! ");
    }
}
