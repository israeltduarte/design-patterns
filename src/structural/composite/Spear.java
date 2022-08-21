package structural.composite;

public class Spear implements Weapon {

    @Override
    public void use(String enchantment) {
        System.out.println("Using a spear with a " + enchantment + " enchantment.");
    }

}
