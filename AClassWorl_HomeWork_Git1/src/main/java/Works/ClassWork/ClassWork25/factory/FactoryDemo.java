package Works.ClassWork.ClassWork25.factory;

public class FactoryDemo {
    public static void main(String... args) {
        CharacterFactory factory = new CharacterFactory();
        GameCharacter wizard = factory.createCharacter("wizard");
        GameCharacter warrior = factory.createCharacter("warrior");
        wizard.attack();
        warrior.attack();
    }
}