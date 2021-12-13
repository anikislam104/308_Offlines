package threading;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Users {
    private int id;
    private PrintWriter printWriter;
    private ArrayList<Stock> myStocks=new ArrayList<>();
    private ArrayList<String> notifications=new ArrayList<>();

    public Users() {
    }

    public Users(int id, PrintWriter printWriter) {
        this.id = id;
        this.printWriter = printWriter;
    }

    public Users(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    void subscribe(Stock s){
        myStocks.add(s);
    }

    void unsubscribe(Stock s){
        myStocks.remove(s);
    }

    public ArrayList<Stock> getMyStocks() {
        return myStocks;
    }

    void show(){
        for(int i=0;i<myStocks.size();i++){
            myStocks.get(i).show();
        }
    }

    public ArrayList<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(ArrayList<String> notifications) {
        this.notifications = notifications;
    }

    public void addNotifications(String s){
        notifications.add(s);
    }
}
