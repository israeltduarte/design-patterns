package structural.flyweight;

import java.util.Random;

public class MainFlyweight {

    private static String[] weaponType = {"Swordmaster", "Ranger"};
    private static String[] enchantments = {"Freeze", "Fire", "Explosive"};

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Weaponist w = WeaponistFactory.getWeapon(getRandomEnchantmentType());
            w.applyEnchantment(getRandomEnchantment());
            w.mission();
        }
    }

    public static String getRandomEnchantmentType() {
        Random r = new Random();
        int randInt = r.nextInt(weaponType.length);
        return weaponType[randInt];
    }

    public static String getRandomEnchantment() {
        Random r = new Random();
        int randInt = r.nextInt(enchantments.length);
        return enchantments[randInt];
    }
}
