package packs;

public class WebServer {
    int Django;
    int Spring;
    int Laravel;

    public WebServer() {
        Django=0;
        Spring=0;
        Laravel=0;
    }
    void setWebServer(String webServer){
        if(webServer.equals("Django")){
            Django=1;
        }
        else if(webServer.equals("Spring")){
            Spring=1;
        }
        else{
            Laravel=1;
        }
    }
    String getWebServer(){
        if(Django==1){
            String s="Django";
            return s;
        }
        else if(Spring==1){
            String s="Spring";
            return s;
        }
        else{
            String s="Laravel";
            return s;
        }
    }
}
