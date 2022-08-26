package behavioral.iterator;

public class WeaponRepository implements Container {
    public String weapons[] = {"Sword", "Dagger", "Hammer"};
 
    @Override
    public Iterator getIterator() {
       return new WeaponIterator();
    }
 
    private class WeaponIterator implements Iterator {
 
       int index;
 
       @Override
       public boolean hasNext() {
       
          if(index < weapons.length){
             return true;
          }
          return false;
       }
 
       @Override
       public Object next() {
       
          if(this.hasNext()){
             return weapons[index++];
          }
          return null;
       }		
    }
 }
