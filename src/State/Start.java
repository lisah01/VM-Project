package State;

import OP_Strategy.*;

public class Start extends State{

    // constructor
    public Start(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
        this.id = "Start State";
    }
    public void create(){
        System.out.println("***Start->create()***");
        op.StorePrice();
        m.change_state(1);
        // reset cups
        m.setK(0);
    }

}
