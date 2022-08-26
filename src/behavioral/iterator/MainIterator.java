package behavioral.iterator;

public class MainIterator {
    public static void main(String[] args) {
        WeaponRepository weapons = new WeaponRepository();

        for(Iterator iterator = weapons.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Weapon: " + name);
         }
    }
}
