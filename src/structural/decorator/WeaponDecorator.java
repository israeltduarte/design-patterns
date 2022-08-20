package structural.decorator;

public class WeaponDecorator extends CharacterDecorator {

    public WeaponDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public void describe() {
        decoratedCharacter.describe();
        setWeapon(decoratedCharacter);
    }

    private void setWeapon(Character decoratedCharacter) {
        System.out.println("Character weaponed");
    }

}
