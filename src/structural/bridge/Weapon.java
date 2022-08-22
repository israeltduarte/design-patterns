package structural.bridge;

public abstract class Weapon {

    protected Enchantment enchantment;

    public Weapon(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    abstract public void applyEnchantment();
}
