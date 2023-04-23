package State;

import OP.*;

public abstract class State {
    MDA_EFSM m;
    OP op;

    void create(){}
    void coin(int p){}
    void insert_cups(int n){}
    void card(){}
    void set_price(){}
    void dispose_drink(int d){}
    void additive(int a){}
    void cancel(){}

    // getters and setters for MDA-EFSM and OP
    MDA_EFSM getMDA(){
        return this.m;
    }

    void setMDA(MDA_EFSM m){
        this.m = m;
    }

    OP getOP(){
        return this.op;
    }

    void setOP(OP op){
        this.op = op;
    }

}
