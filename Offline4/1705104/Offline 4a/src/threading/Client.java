package threading;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.logging.SocketHandler;

public class Client extends Thread{
    public static final String Host="localhost";
    public static final int Port=1234;

    private static Stocks allStocks=main.allStocks;
    private static Stocks my=clientControl.allStocks;

    public Client() throws FileNotFoundException {
        start();

    }
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(Host,Port);
        BufferedReader kboard=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        /*Stocks allStocks=new Stocks();*/

        //System.out.println(s2);
        new ServerResponse(socket);
        while (true){
            System.out.println(">");

            String s=kboard.readLine();

            out.println(s);
            /*String[] str=s.split(" ");
            if(str[0].equals("S")||str[0].equals("U")) {
                s = msg.readLine();
                System.out.println(s);
            }
            s=msg.readLine();
            System.out.println(s);
            //System.out.println(str[0]+"  "+str[1]);
            if(s.equals("quit")) break;*/



        }
        //socket.close();
        //System.exit(0);

    }


}
