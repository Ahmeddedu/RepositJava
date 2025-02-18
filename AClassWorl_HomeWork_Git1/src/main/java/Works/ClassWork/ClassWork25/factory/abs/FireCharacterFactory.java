package Works.ClassWork.ClassWork25.factory.abs;

import Works.ClassWork.ClassWork25.factory.GameCharacter;

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