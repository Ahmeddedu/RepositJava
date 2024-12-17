package HomeWork.HomeWork5.Cras;

public class Car {

    private String maker;
    private String model;
    private String color;
    private int year;

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printMe(){
        System.out.println(maker + " " + model + " " + color + " " + year);
    }
}

