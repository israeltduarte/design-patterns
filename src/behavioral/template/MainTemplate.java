package behavioral.template;

public class MainTemplate {
    public static void main(String[] args) {

        SwordTemplate swordType = new WoodenSword();
		swordType.buildSword();
		swordType = new GlassSword();
		swordType.buildSword();
    }
}
