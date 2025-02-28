package Works.ClassWork.ClassWork27.abs;

import Works.ClassWork.ClassWork27.GameCharacter;

public class FireCharacterFactory implements AbstractCharacterFactory {
    @Override
    public GameCharacter createWizard() {
        return new FireWizard();
    }

    @Override
    public GameCharacter createWarrior() {
        return new FireWarrior();
    }
}