package Mediator;

import java.util.ArrayList;

public class JRTA extends Organisations{
    JCC jcc=new JCC();

    public JRTA(JCC jcc) {
        this.jcc = jcc;
    }

    public void request(String service){
        jcc.request("JWSA",service);
    }
}
