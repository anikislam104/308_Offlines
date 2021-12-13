package packs;

import java.util.Scanner;
public class mainClass {

}

class packs {
    public static void main(String[] args) {
        System.out.println("Choose a package");
        System.out.println("1.Silver                  2. Gold");
        System.out.println("3.Diamond                 4.Platinum");
        Scanner scanner=new Scanner(System.in);
        int packages;
        packages=scanner.nextInt();
        Hardware hardware=new Hardware();
        if(packages==1){
            hardware.setPackages(1,0,0,0);
        }
        else if(packages==2){
            hardware.setPackages(0,1,0,0);
        }
        else if(packages==3){
            hardware.setPackages(0,0,1,0);
        }
        else{
            hardware.setPackages(0,0,0,1);
        }
        System.out.println("Choose Internet Connection");
        System.out.println("1.WiFi       2.GSM         3.Ethernet");
        int internet;
        internet=scanner.nextInt();
        if(internet==1){
            hardware.setInternetConnection(1,0,0);
        }
        else if(internet==2){
            hardware.setInternetConnection(0,1,0);
        }
        else{
            hardware.setInternetConnection(0,0,1);
        }
        System.out.println("Choose web server");
        System.out.println("1.Django    2.Spring     3.Laravel");
        int web;
        web=scanner.nextInt();
        if(web==1){
            hardware.getWebServer().setWebServer("Django");
        }
        else if(web==2){
            hardware.getWebServer().setWebServer("Spring");
        }
        else{
            hardware.getWebServer().setWebServer("Laravel");
        }
        hardware.getPackages().print();
        System.out.println("Web server: "+hardware.getWebServer().getWebServer());
    }
}
