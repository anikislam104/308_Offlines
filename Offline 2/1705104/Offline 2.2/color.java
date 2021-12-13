package Offline2;

public class color implements Aesthetics{
    String Name;
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name=name;
    }
}
