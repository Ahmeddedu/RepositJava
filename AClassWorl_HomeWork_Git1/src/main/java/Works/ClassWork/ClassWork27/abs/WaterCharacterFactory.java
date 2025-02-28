package Works.ClassWork.ClassWork27.abs;

import Works.ClassWork.ClassWork27.GameCharacter;

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