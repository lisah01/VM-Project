package State;

import OP.*;

public class Start extends State{

    // constructor
    public Start(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
    }
    void create(){
        op.StorePrice();
        m.setK(0);
        m.change_state(1);
    }

}