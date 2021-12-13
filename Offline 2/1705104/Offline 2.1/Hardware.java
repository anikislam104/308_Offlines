package packs;

public class Hardware {
    private Packages packages;
    private WebServer webServer;

    public Hardware() {
        webServer=new WebServer();
    }

    void setPackages(int silver, int gold, int diamond, int platinum){
        if(silver==1){
            packages=new Silver();
        }
        else if(gold==1){
            packages=new Gold();
        }
        else if(diamond==1){
            packages=new Diamond();
        }
        else {
            packages=new Platinum();
        }
    }

    public Packages getPackages() {
        return packages;
    }

    void setWebServer(int django,int spring,int laravel){
        if(django==1){
            webServer.setWebServer("Django");
        }
        else if(spring==1){
            webServer.setWebServer("Spring");
        }
        else{
            webServer.setWebServer("Laravel");
        }
    }

    public WebServer getWebServer() {
        return webServer;
    }

    void setInternetConnection(int wifi,int gsm,int ethernet){
        if(wifi==1){
            packages.getMicrocontroller().setInternetConnection("WiFi");
        }
        else if(gsm==1){
            packages.getMicrocontroller().setInternetConnection("GSM");
        }
        else{
            packages.getMicrocontroller().setInternetConnection("Ethernet");
        }
    }
}
