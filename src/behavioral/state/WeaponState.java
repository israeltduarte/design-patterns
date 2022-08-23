package behavioral.state;

public interface WeaponState {

    void next(Weapon weapon);
    void previous(Weapon weapon);
    void showState();

}
