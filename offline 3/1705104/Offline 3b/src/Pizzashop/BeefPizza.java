package Pizzashop;

public class BeefPizza implements Pizza{
    private int price;

    public BeefPizza() {
        price=300;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public void show() {
        System.out.println("Beef Pizza");
    }
}
