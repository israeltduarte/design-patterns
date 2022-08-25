package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Weapons implements Cloneable {

    private List<String> weaponsList;
    
    public Weapons() {
        weaponsList = new ArrayList<>();
    }

    public Weapons(List<String> weaponsList) {
        this.weaponsList = weaponsList;
    }

    public void takeAll() {
        weaponsList.add("Sword");
        weaponsList.add("Dagger");
        weaponsList.add("Hammer");
    }

    public List<String> getWeaponsList() {
        return this.weaponsList;
    }

    @Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getWeaponsList()){
				temp.add(s);
			}
			return new Weapons(temp);
	}

    @Override
    public String toString() {
        return "Weapons [weaponsList=" + weaponsList + "]";
    }

}
