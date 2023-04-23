package State;

import OP.*;

public class MDA_EFSM {
    private State s;
    private State[] L = new State[4];
    private int k = 0;
    public int AL[];

    public MDA_EFSM(OP op){
        L[0] = new Start(this, op);
        L[1] = new NoCups(this, op);
        L[2] = new Idle(this, op);
        L[3] = new CoinsInserted(this, op);

        // default start
        s = L[0];
    }

    // setter and getter for k
    protected void setK(int n){
        this.k = n;
    }
    protected int getK(){
        return this.k;
    }

    // change states
    protected void change_state(int state){
        s = L[state];
    }

    protected void create(){}

    protected void coin(int f){
        if (f==0){
            // insufficient funds
        }
        else if (f==1){
            // sufficient funds
        }
        else{
            System.out.println("Error in MDA-EFSM coin()");
        }
    }
    protected void insert_cups(int n){}
    protected void card(){}
    protected void set_price(){}
    protected void dispose_drink(int d){}
    protected void additive(int a){}
    protected void cancel(){}
}
