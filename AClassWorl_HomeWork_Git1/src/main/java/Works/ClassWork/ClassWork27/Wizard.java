package Works.ClassWork.ClassWork27;

public class Wizard implements GameCharacter {

    private int characterLevel;

    public Wizard(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    @Override
    public void attack() {
        System.out.println("Wizard casts a fireball! " + characterLevel + " times");
    }
}