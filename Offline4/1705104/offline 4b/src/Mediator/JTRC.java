package Mediator;

import java.util.ArrayList;

public class JTRC extends Organisations{
    JCC jcc=new JCC();

    public JTRC(JCC jcc) {
        this.jcc = jcc;
    }

    public void request(String service){
        jcc.request("JWSA",service);
    }
}
