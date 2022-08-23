package structural.proxy;

public class WarriorProxy implements Warrior {

    private boolean knowsHowToUseASword;
    private Warrior warrior;

    public WarriorProxy(String weapon) {
        if("sword".equals(weapon)) {
            knowsHowToUseASword = true;
        }

        this.warrior = new WarriorImpl();
    }

    @Override
    public void attackWithSword() {
        if(this.knowsHowToUseASword) {
            warrior.attackWithSword();
        } else {
            System.out.println("The warrior doesn't know how to use a sword.");
        }
    }
}
