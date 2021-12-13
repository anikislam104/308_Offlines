package threading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerResponse extends Thread{
    private String response;
    Socket socket;

    public ServerResponse(Socket socket) {
        this.socket = socket;
        start();
    }
    @Override
    public void run(){
        super.run();
        while (true){
            BufferedReader fromServer = null;
            try {
                fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                response = fromServer.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            String [] splitted = response.split("\\+");
            //System.out.println("From Server: ");
            for(int i=0;i<splitted.length;i++){
                System.out.println(splitted[i]);
                System.out.println("\n");
            }
        }
    }
}
