package Pizzashop;

public class OnionRings extends Appetizer{
    private int price;
    public OnionRings(Meal meal) {
        super(meal);
        price=100;
    }

    public int getPrice() {
        return price;
    }

    public void show(){
        super.show();
        System.out.println("Onion Rings");
    }
}
