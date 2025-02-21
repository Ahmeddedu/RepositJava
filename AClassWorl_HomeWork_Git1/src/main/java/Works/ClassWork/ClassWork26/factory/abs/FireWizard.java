package Works.ClassWork.ClassWork26.factory.abs;

import Works.ClassWork.ClassWork26.factory.GameCharacter;

public class FireWizard implements GameCharacter {

    @Override
    public void attack() {
        System.out.println("🔥 Fire Wizard casts a fireball! 🔥");
        System.out.println("   (  )   (  )   (  )");
        System.out.println("    ) )   ) )   ) ) ");
        System.out.println("   ( (   ( (   ( (  ");
    }
}
