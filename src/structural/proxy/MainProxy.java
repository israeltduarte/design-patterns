package structural.proxy;

public class MainProxy {
    public static void main(String[] args) {
        
        Warrior warrior1 = new WarriorProxy("sword");
        warrior1.attackWithSword();

        Warrior warrior2 = new WarriorProxy("dagger");
        warrior2.attackWithSword();
    }
}