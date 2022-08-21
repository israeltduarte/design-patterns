package structural.adapter;

public class WeaponAdapter implements Enchantment{

    public Sword sword;

    public WeaponAdapter(Sword sword) {
        this.sword = sword;
    }

    @Override
    public void enchant() {
        sword.cut();
    }

}
