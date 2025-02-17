package edu.patterns.factory.abs;

import Works.ClassWork.ClassWork25.factory.GameCharacter;

public interface AbstractCharacterFactory {

    GameCharacter createWizard();

    GameCharacter createWarrior();

}
