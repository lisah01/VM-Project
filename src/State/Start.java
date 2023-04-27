package State;

import OP.*;

public class Start extends State{

    // constructor
    public Start(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
        this.id = "Start State";
    }
    void create(){
        op.StorePrice();
        m.change_state(1);
        m.setK(0);
    }

}
