package behavioral.state;

public class SheathedState implements WeaponState {

    @Override
    public void next(Weapon weapon) {
        weapon.setState(new UnsheatedState());
    }

    @Override
    public void previous(Weapon weapon) {
        System.out.println("The warrior still doesn't have a weapon.");
    }

    @Override
    public void showState() {
        System.out.println("The weapon is still sheathed.");
    }

}
