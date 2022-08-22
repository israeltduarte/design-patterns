package structural.bridge;

public class Sword extends Weapon {

    public Sword(Enchantment enchantment) {
        super(enchantment);
    }

    @Override
    public void applyEnchantment() {
        System.out.print("Sword enchanted with ");
        this.enchantment.applyEnchantment();
    }
    
}
