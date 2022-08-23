package behavioral.state;

public class UnsheatedState implements WeaponState {

    @Override
    public void next(Weapon weapon) {
        weapon.setState(new EnchantedState());
    }

    @Override
    public void previous(Weapon weapon) {
        weapon.setState(new UnsheatedState());
    }

    @Override
    public void showState() {
        System.out.println("The weapon was unsheathed and is really heavy.");
    }

}
