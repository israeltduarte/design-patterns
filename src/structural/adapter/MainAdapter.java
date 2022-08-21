package structural.adapter;

public class MainAdapter  {
    public static void main(String[] args) {
        Sword sword = new Sword();
        System.out.println("\nA warrior attacked with his sword:");
        sword.cut();

        Enchantment enchantment = new Magic();
        System.out.println("\nA wizard used his magic:");
        enchantment.enchant();

        Enchantment weaponAdapter = new WeaponAdapter(sword);
        System.out.println("\nA wizard used his magic:");
        weaponAdapter.enchant();
    }
}