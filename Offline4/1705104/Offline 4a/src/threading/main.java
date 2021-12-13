package threading;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main  {
    public static final int port=1234;
    private static ArrayList<clientControl> clients=new ArrayList<>();
    static Stocks allStocks;

    static {
        try {
            allStocks = new Stocks();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Stock> stockList=allStocks.getStocks();
    private static ExecutorService pool= Executors.newFixedThreadPool(5);
    public static void main(String[] args) throws IOException {
        ServerSocket welcome=new ServerSocket(port);
        int idCount=0;

        severkboard sk=new severkboard();
        sk.start();

        while(true){
            Socket c=welcome.accept();
            idCount++;
            clientControl ct= new clientControl(c,idCount);
            ct.start();
        }

    }
}
