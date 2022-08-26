package structural.flyweight;

public class Swordmaster implements Weaponist {

    private final String MISSION;
    private String enchantment;

    public Swordmaster() {
        MISSION = "SLASH ANYONE";
    }

    @Override
    public void applyEnchantment(String enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void mission() {
        System.out.println("Swordmaster with an enchantment " + this.enchantment + ". #" + MISSION);
        
    }

}
