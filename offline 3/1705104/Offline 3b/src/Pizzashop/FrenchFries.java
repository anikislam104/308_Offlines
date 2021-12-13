package Pizzashop;

public class FrenchFries extends Appetizer{
    private int price;
    public FrenchFries(Meal meal) {
        super(meal);
        price=100;
    }

    public int getPrice() {
        return price;
    }

    public void show(){
        super.show();
        System.out.println("French Fries");
    }
}
