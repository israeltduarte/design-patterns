package behavioral.observable;

public class TavernListener implements NewsListener{

    @Override
    public void update(String message) {
        System.out.println("The tavern man called the guards about the robbery.");
    }
    
}
