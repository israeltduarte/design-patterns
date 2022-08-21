package structural.adapter;

public class Sword implements Weapon {

    @Override
    public void cut() {
        System.out.println("A cut happened.");
    }

}
