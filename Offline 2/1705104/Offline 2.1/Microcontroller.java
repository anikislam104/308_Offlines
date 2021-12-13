package packs;

public class Microcontroller {
    private WeightManagement weightManagement;
    private String identification;
    private String storage;
    private String display;
    private String internetConnection;
    private String controller;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeightManagement getWeightManagement() {
        return weightManagement;
    }

    public void setWeightManagement(WeightManagement weightManagement) {
        this.weightManagement = weightManagement;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection(String internetConnection) {
        this.internetConnection = internetConnection;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }
}
