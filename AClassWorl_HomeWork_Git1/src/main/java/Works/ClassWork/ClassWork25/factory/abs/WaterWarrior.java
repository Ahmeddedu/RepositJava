package edu.patterns.factory.abs;

import Works.ClassWork.ClassWork25.factory.GameCharacter;

public class WaterWarrior implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("💧 Water Warrior swings an ice sword! 💧");
        System.out.println("  ❄️\\|||||/❄️  ");
        System.out.println("   (o_o)❄️===>");
        System.out.println("  / ||||| \\ ");
    }
}
