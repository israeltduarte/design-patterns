package structural.flyweight;

public class Ranger implements Weaponist {

    private final String MISSION;
    private String enchantment;

    public Ranger() {
        MISSION = "PIERCE ANY TARGET";
    }

    @Override
    public void applyEnchantment(String enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void mission() {
        System.out.println("Ranger with an enchantment " + this.enchantment + ". #" + MISSION);
        
    }

}
