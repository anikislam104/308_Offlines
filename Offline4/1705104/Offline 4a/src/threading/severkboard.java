package threading;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class severkboard extends Thread{
    //static Stocks allStocks;
    private Stocks stocks=clientControl.allStocks;
    private Stocks serverStocks=main.allStocks;
    public severkboard() {
        //stocks=allstocks;

    }
    @Override
    public void run(){
        while(true){
            Scanner scanner=new Scanner(System.in);
            String msg=scanner.nextLine();
            //System.out.println(msg);
            String[] str=msg.split(" ");
            //System.out.println(str[0]+"  "+str[1]+" "+str[2]);
            if(str[0].equals("I")){
                String stockName=str[1];
                Double price=Double.parseDouble(str[2]);
                for(int i=0;i<stocks.getSize();i++){
                    int check=0;
                    if(stockName.equals(stocks.getStockatIndex(i).getStockName())){
                        //stocks.getStockatIndex(i).setStockPrice(stocks.getStockatIndex(i).getStockPrice()+price);
                        //serverStocks.getStockatIndex(i).setStockPrice(serverStocks.getStockatIndex(i).getStockPrice()+price);
                        //serverStocks.getStockatIndex(i).show();
                        main.stockList.get(i).setStockPrice(main.stockList.get(i).getStockPrice()+price);
                        //System.out.println(main.stockList.get(i).getStockPrice());
                        //System.out.println(stocks.getStockatIndex(i).getSubscribers().size());
                        //stocks.getStockatIndex(i).notifySubs("hi");
                        for(int j=0;j<stocks.getStockatIndex(i).getSubscribers().size();j++){
                            //System.out.println("entered");
                            Users user=stocks.getStockatIndex(i).getSubscribers().get(j);
                            //user.show();
                            //user.addNotifications("hi");
                            user.getPrintWriter().println("Stock price of "+ stocks.getStockatIndex(i).getStockName()+" increased by "+price);
                        }
                        check=1;
                    }

                }
            }
            else if(str[0].equals("D")){
                String stockName=str[1];
                Double price=Double.parseDouble(str[2]);
                for(int i=0;i<stocks.getSize();i++){
                    int check=0;
                    if(stockName.equals(stocks.getStockatIndex(i).getStockName())){
                        stocks.getStockatIndex(i).setStockPrice(stocks.getStockatIndex(i).getStockPrice()-price);
                        serverStocks.getStockatIndex(i).setStockPrice(serverStocks.getStockatIndex(i).getStockPrice()-price);
                        //System.out.println(stocks.getStockatIndex(i).getSubscribers().size());
                        //stocks.getStockatIndex(i).notifySubs("hi");
                        for(int j=0;j<stocks.getStockatIndex(i).getSubscribers().size();j++){
                            //System.out.println("entered");
                            Users user=stocks.getStockatIndex(i).getSubscribers().get(j);
                            //user.show();
                            //user.addNotifications("hi");
                            user.getPrintWriter().println("Stock price of "+stocks.getStockatIndex(i).getStockName()+"  decreased by "+price);
                        }
                        check=1;
                    }

                }
            }
            else if(str[0].equals("C")){
                String stockName=str[1];
                int count=Integer.parseInt(str[2]);
                for(int i=0;i<stocks.getSize();i++){
                    int check=0;
                    if(stockName.equals(stocks.getStockatIndex(i).getStockName())){
                        stocks.getStockatIndex(i).setCount(count);
                        serverStocks.getStockatIndex(i).setCount(count);
                        //System.out.println(stocks.getStockatIndex(i).getSubscribers().size());
                        //stocks.getStockatIndex(i).notifySubs("hi");
                        for(int j=0;j<stocks.getStockatIndex(i).getSubscribers().size();j++){
                            //System.out.println("entered");
                            Users user=stocks.getStockatIndex(i).getSubscribers().get(j);
                            //user.show();
                            //user.addNotifications("hi");
                            user.getPrintWriter().println("Stock count of "+stocks.getStockatIndex(i).getStockName()+"  changed to "+count);
                        }
                        check=1;
                    }

                }
            }
        }
    }
}
