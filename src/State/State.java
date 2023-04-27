package State;

import OP_Strategy.*;

public abstract class State {
    MDA_EFSM m;
    OP op;
    // id for identifying current state
    String id;

    public void create(){}
    public void coin(int p){}
    public void insert_cups(int n){}
    public void card(){}
    public void set_price(){}
    public void dispose_drink(int d){}
    public void additive(int a){}
    public void cancel(){}
}
