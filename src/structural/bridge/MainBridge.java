package structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        
        Weapon dagger = new Dagger(new Fire());
        Weapon sword = new Sword(new Ice());

        dagger.applyEnchantment();
        sword.applyEnchantment();
    }
    
}
