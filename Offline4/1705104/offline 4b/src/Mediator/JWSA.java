package Mediator;

import java.util.ArrayList;

public class JWSA extends Organisations{
    JCC jcc=new JCC();

    public JWSA(JCC jcc) {
        this.jcc = jcc;
    }

    public void request(String service){
        jcc.request("JWSA",service);
    }
}
