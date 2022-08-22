package behavioral.template;

public abstract class SwordTemplate {

    public final void buildSword() {
        craftHilt();
        makeBlade();
        sharp();
        System.out.println("Sword was created.");
    }

    private void sharp() {
        System.out.println("sharpening the blade...");
    }

    private void craftHilt() {
        System.out.println("crafting the hild...");
    }

    public abstract void makeBlade();

}
