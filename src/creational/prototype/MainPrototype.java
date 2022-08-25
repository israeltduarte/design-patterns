package creational.prototype;

import java.util.List;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Weapons weapons1 = new Weapons();
        weapons1.takeAll();

        Weapons weapons2 = (Weapons) weapons1.clone();
        Weapons weapons3 = (Weapons) weapons1.clone();

        List<String> list1 = weapons2.getWeaponsList();
        list1.add("Spear");

        List<String> list2 = weapons3.getWeaponsList();
        list2.remove("Dagger");

        System.out.println(weapons1);
        System.out.println(weapons2);
        System.out.println(weapons3);
    }
}
