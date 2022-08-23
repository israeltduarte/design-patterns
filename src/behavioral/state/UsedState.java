package behavioral.state;

public class UsedState implements WeaponState {

    @Override
    public void next(Weapon weapon) {
        System.out.println("Weapon state hasn't changed.");
    }

    @Override
    public void previous(Weapon weapon) {
        weapon.setState(new EnchantedState());
    }

    @Override
    public void showState() {
        System.out.println("The weapon was used and has killed " + Math.round(Math.random()*10) + " people.");
    }

}
