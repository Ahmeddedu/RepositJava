package Works.HomeWork.HomeWork5.Cras;

public class Prog {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setMaker( "BMW");
        car1.setModel("X5");
        car1.setColor("Red");
        car1.setYear(2021);
        car1.printMe();

        Car car2 = new Car();
        car2.setMaker( "Lexus");
        car2.setModel("Rx 350");
        car2.setColor("White");
        car2.setYear(2024);
        car2.printMe();

        Car car3 = new Car();
        car3.setMaker( "Mercedes");
        car3.setModel("G-Class");
        car3.setColor("Green");
        car3.setYear(2019);
        car3.printMe();
    }
}
