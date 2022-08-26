package structural.flyweight;

import java.util.HashMap;

public class WeaponistFactory {

    private static HashMap <String, Weaponist> actor =new HashMap<>();

    public static Weaponist getWeapon(String type) {
        Weaponist w = null;

        if(actor.containsKey(type)) {
            w = actor.get(type);
        } else {
            switch (type) {
                case "Swordmaster":
                    System.out.println("Swordmaster was created");
                    w = new Swordmaster();
                    break;
                case "Ranger":
                    System.out.println("Ranger was created");
                    w = new Ranger();
                    break;
                default:
                    System.out.println("Unable to create an user.");
                    break;
            }

            actor.put(type, w);
        }

        return w;
    }

}
