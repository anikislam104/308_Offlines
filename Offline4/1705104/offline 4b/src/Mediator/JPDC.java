package Mediator;

import java.util.ArrayList;

public class JPDC extends Organisations{
    JCC jcc=new JCC();

    public JPDC(JCC jcc) {
        this.jcc = jcc;
    }

    public void request(String service){
        jcc.request("JWSA",service);
    }
}
