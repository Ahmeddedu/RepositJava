package edu.patterns.factory.abs;

import Works.ClassWork.ClassWork25.factory.GameCharacter;

public class WaterWizard implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("💧 Water Wizard casts a water wave! 💧");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      ~~~~~~        ");
        System.out.println("  ~~~~~~~~~~~~     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }
}
