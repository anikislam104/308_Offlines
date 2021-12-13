package Offline2;

public class font implements Aesthetics{
    private String Name;
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name=name;
    }
}
