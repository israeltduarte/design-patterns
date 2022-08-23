package behavioral.state;

public class Weapon {

    private WeaponState state = new SheathedState();

    public WeaponState getState() {
        return this.state;
    }

    public void setState(WeaponState state) {
        this.state = state;
    }

    public void previousState() {
        state.previous(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void showState() {
        state.showState();
    }

}
