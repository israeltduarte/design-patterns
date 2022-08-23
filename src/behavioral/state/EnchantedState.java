package behavioral.state;

public class EnchantedState implements WeaponState {

    @Override
    public void next(Weapon weapon) {
        weapon.setState(new UsedState());
    }

    @Override
    public void previous(Weapon weapon) {
        weapon.setState(new UnsheatedState());
    }

    @Override
    public void showState() {
        System.out.println("The weapon was enchanted with magic and can be used.");
    }

}
