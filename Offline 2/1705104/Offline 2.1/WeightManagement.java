package packs;

public class WeightManagement {
    private int loadSensor;
    private int weightModule;

    public WeightManagement() {
        loadSensor=0;
        weightModule=0;
    }

    void setWeightManagement(String s){
        if(s.equals("Load sensor")){
            loadSensor=1;
        }
        else{
            weightModule=1;
        }
    }

    String getWeightManagement(){
        if(loadSensor==1){
            String s="Load sensor";
            return s;
        }
        else{
            String s="Weight Module";
            return s;
        }
    }
}
