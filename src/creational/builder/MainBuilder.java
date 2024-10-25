package creational.builder;

public class MainBuilder {

    public static void main(String[] args) {

        Character marco = new Character("Marco", "Vento", 15);
        Character oliver = new Character.CharacterBuilder()
            .setName("Oliver")
            .setPower("Água")
            .build();
        
        Character miro = new Character.CharacterBuilder()
            .setName("Miro")
            .setPower("Fogo")
            .setAge(22)
            .build();

        System.out.println(marco);
        System.out.println(oliver);
        System.out.println(miro);
    }
}
