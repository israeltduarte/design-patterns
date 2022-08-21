package structural.composite;

public class MainComposite {

    public static void main(String[] args) {
        
        Weapon sword = new Sword();
        Weapon dagger = new Dagger();
        Weapon spear = new Spear();

        Enchantment enchantment = new Enchantment();
        enchantment.add(sword);
        enchantment.add(dagger);
        
        enchantment.use("Fire");

        enchantment.clear();

        enchantment.add(sword);
        enchantment.add(dagger);
        enchantment.add(spear);

        enchantment.use("Water");
    }
    
}
