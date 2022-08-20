package structural.decorator;

public class ArmorDecorator extends CharacterDecorator {

    public ArmorDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public void describe() {
        decoratedCharacter.describe();
        setArmor(decoratedCharacter);
    }

    private void setArmor(Character decoratedCharacter) {
        System.out.println("Character armored");
    }

}
