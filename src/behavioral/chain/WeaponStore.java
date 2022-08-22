package behavioral.chain;

public class WeaponStore {

    private Chain chain;
    
    public WeaponStore(Chain chain) {
        this.chain = chain;
    }

    public Chain getChain() {
        return this.chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public void canBuy(Integer goldAmount) {
        this.chain.process(goldAmount);
    }
    
}