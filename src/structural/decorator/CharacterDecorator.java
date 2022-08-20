package structural.decorator;

public class CharacterDecorator implements Character {

    protected Character decoratedCharacter;

    public CharacterDecorator(Character decoratedCharacter) {
        this.decoratedCharacter = decoratedCharacter;
    }

    @Override
    public void describe() {
        decoratedCharacter.describe();
    }    
}
