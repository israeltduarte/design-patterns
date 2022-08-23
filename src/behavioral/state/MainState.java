package behavioral.state;

public class MainState {
    public static void main(String[] args) {
        
        Weapon weapon = new Weapon();
        
        weapon.showState();
        weapon.nextState();
        weapon.showState();
        weapon.nextState();
        weapon.showState();
        weapon.nextState();
        weapon.showState();
    }
}