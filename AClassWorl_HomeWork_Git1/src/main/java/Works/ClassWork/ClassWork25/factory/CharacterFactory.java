package Works.ClassWork.ClassWork25.factory;

public class CharacterFactory {
    public GameCharacter createCharacter(String type) {
        if ("wizard".equalsIgnoreCase(type)) {
            return new Wizard();
        } else if ("warrior".equalsIgnoreCase(type)) {
            return new Warrior();
        } else {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }
    }
}