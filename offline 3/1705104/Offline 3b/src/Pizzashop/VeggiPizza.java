package Pizzashop;

public class VeggiPizza implements Pizza{
    private int price;

    public VeggiPizza() {
        price=200;
    }

    public int getPrice() {
        return price;
    }

    @Override

    public void show() {
        System.out.println("Veggi Pizza");
    }
}
