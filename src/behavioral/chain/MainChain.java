package behavioral.chain;

public class MainChain {
    public static void main(String[] args) {
        
        Chain chain = new Chain();

        chain.setChain(new SwordProcessor(new DaggerProcessor(null)));

        WeaponStore weaponStore = new WeaponStore(chain);
        
        weaponStore.canBuy(15);
        weaponStore.canBuy(41);
        weaponStore.canBuy(39);
        weaponStore.canBuy(19);
        weaponStore.canBuy(20);
    }
}
