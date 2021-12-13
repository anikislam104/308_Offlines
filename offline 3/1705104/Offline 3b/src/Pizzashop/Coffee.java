package Pizzashop;

public class Coffee extends Drinks{
    private int price;
    public Coffee(Meal meal) {
        super(meal);
        price=50;
    }

    public int getPrice() {
        return price;
    }

    public void show(){
        super.show();
        System.out.println("Coffee");
    }
}
