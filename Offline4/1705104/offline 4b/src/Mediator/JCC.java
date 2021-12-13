package Mediator;

import java.util.*;

public class JCC {
    Queue requestsJPDC=new LinkedList();
    Queue requestsJTRC=new LinkedList();
    Queue requestsJRTA=new LinkedList();
    Queue requestsJWSA=new LinkedList();

    void request(String org,String service){
        if(service.equals("TELECOM")){
            requestsJTRC.add(org);

        }
        else if(service.equals("WATER")){
            requestsJWSA.add(org);
        }
        else if(service.equals("POWER")){
            requestsJPDC.add(org);
        }
        else if(service.equals("TRANSPORT")){
            requestsJRTA.add(org);
        }
        System.out.println(org+" requests for "+service+" service");

    }

    void grantRequest(String org){
        String s=new String();
        if(org.equals("JPDC")){
            //System.out.println(requestsJPDC.remove());
            s= (String) requestsJPDC.poll();
        }
        else if(org.equals("JRTA")){
            s= (String) requestsJRTA.remove();
        }
        else if(org.equals("JTRC")){
            s= (String) requestsJTRC.remove();
            //System.out.println(s);
        }
        else{
            s= (String) requestsJWSA.remove();
        }
        System.out.println(org+" serves the request of "+s);
    }
}
