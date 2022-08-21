package structural.adapter;

public class Magic implements Enchantment {

    @Override
    public void enchant() {
        System.out.println("An enchantment was thrown.");
    }

}
