package threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Stock {
    private String stockName;
    private double stockPrice;
    private int count;
    private List<Users> subscribers=new ArrayList<>();

    public Stock() {
        stockPrice=0;
    }

    public Stock(String stockName) {
        this.stockName = stockName;
    }

    public Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void Subscribe(Users users){
        subscribers.add(users);
        //System.out.println(subscribers.size());
        users.subscribe(this);
    }

    public void Unsubscribe(Users users){
        subscribers.remove(users);
        users.unsubscribe(this);
    }

    public void changePrice(double price){
        stockPrice=price;
    }

    public List<Users> getSubscribers() {
        return subscribers;
    }

    public void show(){
        System.out.println("Stock name: "+stockName+" ,count= "+count+" ,price= "+stockPrice);
    }

    public  void notifySubs(String msg){
        //System.out.println(subscribers.size());
        for(int i=0;i<subscribers.size();i++){
            subscribers.get(i).getPrintWriter().println("hi");
        }
    }

    public String showr(){
        return "Stock name: "+stockName+" ,count= "+count+" ,price= "+stockPrice;
    }
}

