package creational.singleton;

public class MainSingleton {

    public static void main(String[] args) {

        EnumDataHora dataHora = EnumDataHora.INSTANCE.getInstance();

        System.out.println(dataHora.getCurrentDataHora());
    }
}
