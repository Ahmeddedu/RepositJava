package Works.ClassWork.ClassWork25.factory.abs;

import Works.ClassWork.ClassWork25.factory.GameCharacter;

public class FireWarrior implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("🔥 Fire Warrior swings a flaming sword! 🔥");
        System.out.println("  \\|||||/  ");
        System.out.println("   (o_o)🔥===>");
        System.out.println("  / ||||| \\ ");
    }
}
