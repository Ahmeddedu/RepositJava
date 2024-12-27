package Works.ClassWork.ClassWork5.Osnova;

public class CalcPriv {

    public int currentValue = 0 ;

    public int plus(int a){
        currentValue = currentValue + a;
        printCurrentState();
        return currentValue;
    }

    public int minus( int a){
        currentValue = currentValue - a;
        printCurrentState();
        return currentValue;
    }

    public int getCurrentValue(){
        return this.currentValue;
    }

    private void printCurrentState(){
        System.out.println(this.currentValue);
    }
}
