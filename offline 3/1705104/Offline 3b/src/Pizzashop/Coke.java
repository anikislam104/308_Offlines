package Pizzashop;

public class Coke extends Drinks{
    private int price;
    public Coke(Meal meal) {
        super(meal);
        price=20;
    }

    public int getPrice() {
        return price;
    }

    public void show(){
        super.show();
        System.out.println("Coke");
    }
}
