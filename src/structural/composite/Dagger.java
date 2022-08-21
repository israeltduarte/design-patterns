package structural.composite;

public class Dagger implements Weapon {

    @Override
    public void use(String enchantment) {
        System.out.println("Using a dagger with a " + enchantment + " enchantment.");
    }

}
