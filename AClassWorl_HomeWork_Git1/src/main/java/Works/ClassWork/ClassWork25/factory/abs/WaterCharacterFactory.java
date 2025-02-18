package Works.ClassWork.ClassWork25.factory.abs;

import Works.ClassWork.ClassWork25.factory.GameCharacter;

public class WaterCharacterFactory implements AbstractCharacterFactory {
    @Override
    public GameCharacter createWizard() {
        return new WaterWizard();
    }

    @Override
    public GameCharacter createWarrior() {
        return new WaterWarrior();
    }
}