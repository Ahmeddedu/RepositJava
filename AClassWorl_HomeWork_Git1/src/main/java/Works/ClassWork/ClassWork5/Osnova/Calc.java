package Works.ClassWork.ClassWork5.Osnova;

public class Calc {
    int currentValue = 0 ;

    public int plus(int a){
        currentValue = currentValue + a;
        return currentValue;
    }

    public int minus( int a){
        currentValue = currentValue - a;
        return currentValue;
    }

    public int getCurrentValue(){
        return this.currentValue;
    }

}