package packs;

public class RaspberryPi extends Microcontroller{
    private WeightManagement weightManagement;
    private String identification;
    private String storage;
    private String display;
    private String internetConnection;
    private String controller;
    private String name;

    public RaspberryPi() {
        identification="NFC card";
        storage="Internal";
        display="Touch Screen";
        controller="Touch Screen";
        name="Raspberry Pi";
    }

    @Override
    public String getIdentification() {
        return identification;
    }

    @Override
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public String getStorage() {
        return storage;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getController() {
        return controller;
    }

    @Override
    public void setController(String controller) {
        this.controller = controller;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public WeightManagement getWeightManagement() {
        return weightManagement;
    }

    @Override
    public void setWeightManagement(WeightManagement weightManagement) {
        this.weightManagement = weightManagement;
    }

    @Override
    public String getInternetConnection() {
        return internetConnection;
    }

    @Override
    public void setInternetConnection(String internetConnection) {
        this.internetConnection = internetConnection;
    }
}
