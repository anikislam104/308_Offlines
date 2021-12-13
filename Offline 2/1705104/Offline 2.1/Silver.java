package packs;

public class Silver extends Packages{
    private Microcontroller microcontroller;

    public Silver() {
        microcontroller=new ATMega32();
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
        System.out.println("Package name: Silver");
        System.out.println("Microcontroller: "+microcontroller.getName());
        System.out.println("Weight measurement: "+microcontroller.getWeightManagement().getWeightManagement());
        System.out.println("Identification: "+microcontroller.getIdentification());
        System.out.println("Storage: "+microcontroller.getStorage());
        System.out.println("Display: "+microcontroller.getDisplay());
        System.out.println("Internet Connection: "+microcontroller.getInternetConnection());
        System.out.println("Controller: "+microcontroller.getController());
    }
}
