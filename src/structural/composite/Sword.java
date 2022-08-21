package structural.composite;

public class Sword implements Weapon{

    @Override
    public void use(String enchantment) {
        System.out.println("Using a sword with a " + enchantment + " enchantment.");
    }

}
