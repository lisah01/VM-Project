package State;

import OP.*;

public abstract class State {
    MDA_EFSM m;
    OP op;
    // id for identifying current state
    String id;

    void create(){}
    void coin(int p){}
    void insert_cups(int n){}
    void card(){}
    void set_price(){}
    void dispose_drink(int d){}
    void additive(int a){}
    void cancel(){}
}
