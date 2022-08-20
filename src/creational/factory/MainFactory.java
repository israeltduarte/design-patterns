package creational.factory;

public class MainFactory {

    public static void main(String[] args) {

        FireFactory factory = new FireFactory();

        Fire fire;

        fire = factory.getFire("HellFire");
        System.out.println(fire.consumes());

        fire = factory.getFire("HolyFire");
        System.out.println(fire.consumes());
    }
}
