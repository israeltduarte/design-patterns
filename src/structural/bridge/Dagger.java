package structural.bridge;

public class Dagger extends Weapon {

    public Dagger(Enchantment enchantment) {
        super(enchantment);
    }

    @Override
    public void applyEnchantment() {
        System.out.print("Dagger enchanted with ");
        this.enchantment.applyEnchantment();
    }

}
