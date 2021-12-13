package Pizzashop;

public class Decorator implements Meal{
    protected Meal meal;

    public Decorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void show() {
        meal.show();
    }
}
