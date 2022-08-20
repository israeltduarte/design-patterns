package structural.decorator;

public class MainDecorator {
    public static void main(String[] args) {

        Character man = new Man();
        Character manWithArmor = new ArmorDecorator(new Man());
        Character womanWithArmor = new ArmorDecorator(new Woman());

        System.out.println("\nMan character");
        man.describe();

        System.out.println("\nMan with Armor");
        manWithArmor.describe();

        System.out.println("\nWoman with Armor");
        womanWithArmor.describe();

        Character manWithArmorAndWeapon = new Man();
        manWithArmorAndWeapon = new ArmorDecorator(manWithArmorAndWeapon);
        manWithArmorAndWeapon = new WeaponDecorator(manWithArmorAndWeapon);

        System.out.println("\nMan With Armor and Weapon");
        manWithArmorAndWeapon.describe();
    }
}
