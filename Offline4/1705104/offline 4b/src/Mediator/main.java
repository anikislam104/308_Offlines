package Mediator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        JCC jcc=new JCC();
        Organisations jwsa;
        Organisations jpdc;
        Organisations jrta;
        Organisations jtrc;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Init")) {
                jwsa = new JWSA(jcc);
                jpdc = new JPDC(jcc);
                jrta = new JRTA(jcc);
                jtrc = new JTRC(jcc);
                System.out.println("All four services are initiated through mediator");
            } else {
                String[] commands = command.split(" ");
                String first = commands[0];
                String second = commands[1];
                if (second.equals("SERVE")) {
                    jcc.grantRequest(first);
                } else {
                    jcc.request(first,second);
                }
            }
        }
    }

}
