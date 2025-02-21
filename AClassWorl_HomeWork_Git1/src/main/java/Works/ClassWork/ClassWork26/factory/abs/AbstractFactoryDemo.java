package Works.ClassWork.ClassWork26.factory.abs;

import Works.ClassWork.ClassWork26.factory.GameCharacter;

public class AbstractFactoryDemo{
    public static void main(String... args){
        waterAttack();
    }

    public static void waterAttack(){
        WaterCharacterFactory f = new WaterCharacterFactory();
        produceAndAttack(f);
    }

    public static void fireAttack(){
        FireCharacterFactory f = new FireCharacterFactory();
        produceAndAttack(f);
    }
    public static void produceAndAttack(AbstractCharacterFactory af){
        GameCharacter a = af.createWarrior();
        GameCharacter a1 = af.createWarrior();
        GameCharacter a2 = af.createWizard();

        a.attack();
        a1.attack();
        a2.attack();
    }
}
