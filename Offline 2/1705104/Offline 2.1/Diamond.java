package packs;

public class Diamond extends Packages{
    private Microcontroller microcontroller;

    public Diamond() {
        microcontroller=new RaspberryPi();
        WeightManagement weightManagement=new WeightManagement();
        weightManagement.setWeightManagement("Load sensor");
        microcontroller.setWeightManagement(weightManagement);
    }

    @Override
    public Microcontroller getMicrocontroller() {
        return microcontroller;
    }

    @Override
    public void setMicrocontroller(Microcontroller microcontroller) {
        this.microcontroller = microcontroller;
    }

    @Override
    void print(){
        System.out.println("Package name: Diamond");
        System.out.println("Microcontroller: "+microcontroller.getName());
        System.out.println("Weight measurement: "+microcontroller.getWeightManagement().getWeightManagement());
        System.out.println("Identification: "+microcontroller.getIdentification());
        System.out.println("Storage: "+microcontroller.getStorage());
        System.out.println("Display: "+microcontroller.getDisplay());
        System.out.println("Internet Connection: "+microcontroller.getInternetConnection());
        System.out.println("Controller: "+microcontroller.getController());
    }
}
