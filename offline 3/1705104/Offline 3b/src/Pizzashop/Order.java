package Pizzashop;

public class Order {
    private int orderNo;
    private int bill;

    public Order(int orderNo) {
        this.orderNo = orderNo;
    }
    public void showOrder(){
        if(orderNo==1){
            FrenchFries frenchFries=new FrenchFries(new BeefPizza());
            frenchFries.show();
        }
        else if(orderNo==2){
            OnionRings onionRings=new OnionRings(new VeggiPizza());
            onionRings.show();
        }
        else if(orderNo==3){
            Coke coke=new Coke(new FrenchFries(new VeggiPizza()));
            coke.show();
        }
        else if(orderNo==4){
            Coffee coffee=new Coffee(new OnionRings(new VeggiPizza()));
            coffee.show();
        }
        else if(orderNo==5){
            BeefPizza beefPizza=new BeefPizza();
            beefPizza.show();
        }
    }
    public int getBill(){
        if(orderNo==1){
            bill=new FrenchFries(new BeefPizza()).getPrice()+new BeefPizza().getPrice();
        }
        else if(orderNo==2){
            bill=new OnionRings(new VeggiPizza()).getPrice()+new VeggiPizza().getPrice();
        }
        else if(orderNo==3){
            bill=new Coke(new FrenchFries(new VeggiPizza())).getPrice()+new FrenchFries(new VeggiPizza()).getPrice()+new VeggiPizza().getPrice();
        }
        else if(orderNo==4){
            bill=new Coffee(new OnionRings(new VeggiPizza())).getPrice()+new OnionRings(new VeggiPizza()).getPrice()+new VeggiPizza().getPrice();
        }
        else if(orderNo==5){
            bill=new BeefPizza().getPrice();
        }
        return bill;
    }

}
