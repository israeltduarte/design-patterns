package creational.factory;

public class FireFactory {

    public Fire getFire(String fireType) {

        if (fireType == null) {
            return null;
        }

        switch (fireType) {
            case "HolyFire":
                return new HolyFire();
            case "HellFire":
                return new HellFire();
            default:
                return null;
        }
    }
}
