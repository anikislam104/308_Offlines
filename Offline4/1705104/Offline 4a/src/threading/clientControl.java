package threading;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class clientControl extends Thread{
    private Socket socket;
    private BufferedReader in;
    private BufferedReader kboard;
    private PrintWriter out;
    static Stocks allStocks;

    static {
        try {
            allStocks = new Stocks();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int id;
    private Users user;


    public clientControl(Socket sockets,int ID) throws IOException {
        this.socket = sockets;
        in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out=new PrintWriter(socket.getOutputStream(),true);
        kboard=new BufferedReader(new InputStreamReader(System.in));
        id=0;
        user=new Users(out);

    }

    @Override
    public void run() {
        while (true) {
            try {

                String s=in.readLine();
                String[] str=s.split(" ");
                if(str[0].equals("S")){
                    //System.out.println("entered");
                    String stockName=str[1];
                    for(int i=0;i< allStocks.getSize();i++){
                        if(stockName.equals(allStocks.getStockatIndex(i).getStockName())){
                            //System.out.println("entered");
                            Stock runningStock=allStocks.getStockatIndex(i);

                            ArrayList<Stock> stocks=user.getMyStocks();
                            int check=0;
                            for(int j=0;j<stocks.size();j++){
                                if(stocks.get(j)==runningStock){
                                    out.println("You are already subscribed");
                                    check=1;
                                }
                            }
                            if(check==0){
                                user.setPrintWriter(out);
                                runningStock.Subscribe(user);
                                //user.getPrintWriter().println("hi");
                                //System.out.println(allStocks.getStockatIndex(i).getSubscribers().size());
                                out.println("Successfully subscribed");

                            }
                        }
                    }
                }
                else if(str[0].equals("U")){
                    String stockName=str[1];
                    for(int i=0;i< allStocks.getSize();i++){
                        if(stockName.equals(allStocks.getStockatIndex(i).getStockName())){
                            Stock runningStock=allStocks.getStockatIndex(i);

                            ArrayList<Stock> stocks=user.getMyStocks();
                            //stocks.get(0).show();
                            int check=0;
                            for(int j=0;j<stocks.size();j++){
                                if(stocks.get(j)==runningStock){
                                    runningStock.Unsubscribe(user);
                                    out.println("Unsubscibed successfully");
                                    check=1;
                                }
                            }
                            if(check==0){
                                out.println("You didn't subscribed");
                            }
                        }
                    }
                }
                else if(str[0].equals("login")){
                    String s2="";
                    for(int i=0;i<main.stockList.size();i++){
                        s2=s2+" "+main.stockList.get(i).showr();
                    }
                    id=1;
                    out.println(s2);

                }
                    /*if (user.getNotifications().size() == 0) {
                        //System.out.println("entered no noti");
                        out.println(" ");
                    } else {
                        //System.out.println("entered noti");
                        String s1 = user.getNotifications().get(0);
                        user.getNotifications().remove(0);
                        out.println(s1);
                    }*/

                //user.getPrintWriter().println(s);
                if(s.equals("quit")) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
