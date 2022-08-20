package creational.singleton;

public enum EnumDataHora {

    INSTANCE("2022/08/09");

    private String currentDataHora;

    EnumDataHora(String currentDataHora) {
        this.currentDataHora = currentDataHora;
    }

    public EnumDataHora getInstance() {
        return INSTANCE;
    }

    public String getCurrentDataHora() {
        return currentDataHora;
    }

    public void setCurrentDataHora(String currentDataHora) {
        this.currentDataHora = currentDataHora;
    }
}
