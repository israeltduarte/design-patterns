package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Enchantment implements Weapon {

    private List<Weapon> weapons = new ArrayList<>();

    @Override
    public void use(String enchantment) {
        for (Weapon weapon : this.weapons) {
            weapon.use(enchantment);
        }
    }

    public void add(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void remove(Weapon weapon) {
        this.weapons.remove(weapon);
    }

    public void clear() {
        System.out.println("Clearing all enchantments from weapons.");
        weapons.clear();
    }

}
